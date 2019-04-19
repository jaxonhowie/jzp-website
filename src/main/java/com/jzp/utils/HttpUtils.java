package com.jzp.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author Hongyi Zheng
 * @date 2019/4/19
 */
public class HttpUtils {

    private static final Charset DEFAULT_ENC = StandardCharsets.UTF_8;
    private static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";
    private static final int STAT_SUC = 200;
    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    /**
     * 发送post请求
     * 默认contentType为application/json
     *
     * @param uri         请求地址
     * @param requestBody 请求体
     * @return 请求失败返回null
     */
    public static String doPost(String uri, String requestBody) {
        PostMethod postMethod = new PostMethod(uri);
        byte[] b = requestBody.getBytes(DEFAULT_ENC);
        RequestEntity entity = new InputStreamRequestEntity(new ByteArrayInputStream(b, 0, b.length), b.length, DEFAULT_CONTENT_TYPE);
        postMethod.setRequestEntity(entity);
        HttpClient httpClient = new HttpClient();
        try {
            int statusCode = httpClient.executeMethod(postMethod);
            if (statusCode == STAT_SUC) {
                return postMethod.getResponseBodyAsString();
            }
        } catch (IOException e) {
            logger.error("http请求异常:{}", ExceptionUtils.getStackTrace(e));
        }
        return null;
    }
}
