package com.jzp.model.websocket;

import com.jzp.model.Gender;

import javax.security.auth.Subject;
import java.io.Serializable;
import java.security.Principal;
import java.util.Date;

/**
 * @author Hongyi Zheng
 * @date 2019/1/3
 */
public class User implements Principal {

    private String userId;
    private String username;
    private String nickname;
    private Gender gender;
    private Date lastVisit;
    private String tempId;

    public User() {
    }

    public User(String userId, String username, String nickname, Gender gender, Date lastVisit) {
        this.userId = userId;
        this.username = username;
        this.nickname = nickname;
        this.gender = gender;
        this.lastVisit = lastVisit;
    }

    public User(String userId, String username, String nickname, Gender gender, Date lastVisit, String tempId) {
        this.userId = userId;
        this.username = username;
        this.nickname = nickname;
        this.gender = gender;
        this.lastVisit = lastVisit;
        this.tempId = tempId;
    }

    public User(String tempId) {
        this.tempId = tempId;
    }



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }
}
