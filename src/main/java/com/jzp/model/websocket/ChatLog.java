package com.jzp.model.websocket;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hongyi Zheng
 * @date 2018/12/27
 */
public class ChatLog {

    private String message;

    private String postTime;

    public ChatLog() {
    }

    public ChatLog(String message) {
        this.message = message;
    }

    public ChatLog(String message, String postTime) {
        this.message = message;
        this.postTime = postTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}
