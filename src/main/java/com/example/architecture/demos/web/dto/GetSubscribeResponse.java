package com.example.architecture.demos.web.dto;

import com.example.architecture.demos.web.entity.SubscribeJSON;

public class GetSubscribeResponse {
    private int code;
    private SubscribeJSON data;
    private String msg;

    public GetSubscribeResponse(int code, SubscribeJSON data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public GetSubscribeResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SubscribeJSON getData() {
        return data;
    }

    public void setData(SubscribeJSON data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
