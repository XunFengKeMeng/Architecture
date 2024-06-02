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
}
