package com.jzp.model.websocket;

/**
 * @author Hongyi Zheng
 * @date 2018/12/27
 */
public class BroadCastMessage {

    private String message;

    private String username;

    private String userId;

    private String nickname;

    public BroadCastMessage() {
    }


    public BroadCastMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
