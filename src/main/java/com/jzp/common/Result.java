package com.jzp.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.ValueFilter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
public class Result {

    private String code;
    private String message;
    private Object data;

    public static JSONObject buildJson(String transId, RspCode rspCode, String msg, Map<String,Object> data, boolean withBlankChar){
        rspCode = (null == rspCode? RspCode.SUC : rspCode);
        Map<String,Object> map = new HashMap<>(4);
        //TODO  result
        return null;
    }

    public static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object o, String s, Object v) {
            if ( null == v) {
                return "";
            }
            return v;
        }
    };
}