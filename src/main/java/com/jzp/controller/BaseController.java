package com.jzp.controller;

import com.alibaba.fastjson.JSONObject;
import com.jzp.common.Result;
import com.jzp.common.RspCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 返回-成功但不返回数据
     */
    protected Result result() {
        return new Result();
    }

    /**
     * 返回-成功并返回数据
     */
    protected Result result(Object data) {
        return new Result(data);
    }

    /**
     * 返回-只返回错误码，用于异常情况
     */
    protected Result result(RspCode rspCode) {
        return new Result(rspCode);
    }

    /**
     * 返回-只返回错误码并自定义错误信息，用于异常情况
     */
    protected Result result(RspCode rspCode, String msg) {
        return new Result(rspCode, msg);
    }

    /**
     * 返回-用于需要同时返回状态码、信息、数据的情况
     */
    protected Result result(RspCode rspCode, String msg, Object data) {
        return new Result(rspCode, msg, data);
    }

}
