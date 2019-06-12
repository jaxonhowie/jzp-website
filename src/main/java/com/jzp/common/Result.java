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

    public Result() {
    }

    public Result(Object data) {
        buildResult(null, null, data);
    }

    public Result(RspCode rspCode, String msg) {
        buildResult(rspCode, msg, null);
    }

    public Result(RspCode rspCode, String msg, Object data) {
        buildResult(rspCode, msg, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private void buildResult(RspCode rspCode, String msg, Object data) {
        rspCode = rspCode == null ? RspCode.SUC : rspCode;
        this.code = rspCode.code();
        this.message = msg == null ? rspCode.message() : rspCode.message() + "：" + msg;
        this.data = data;
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
