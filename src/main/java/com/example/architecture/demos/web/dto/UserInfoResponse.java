package com.example.architecture.demos.web.dto;

import com.example.architecture.demos.web.entity.UserInfo;

public class UserInfoResponse {
    private int code;
    private UserInfo user;
    private String msg;

    public UserInfoResponse(int code, UserInfo user, String msg) {
        this.code = code;
        this.user = user;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
