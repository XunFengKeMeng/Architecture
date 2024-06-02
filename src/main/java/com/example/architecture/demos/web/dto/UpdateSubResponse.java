package com.example.architecture.demos.web.dto;

import com.example.architecture.demos.web.entity.UserInfo;

public class UpdateSubResponse {
    private int code;
    private String msg;

    public UpdateSubResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public UpdateSubResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
