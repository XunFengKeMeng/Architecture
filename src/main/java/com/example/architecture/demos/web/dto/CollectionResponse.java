package com.example.architecture.demos.web.dto;

public class CollectionResponse {
    private int code;
    private PolicyCollection data;
    private String msg;

    public CollectionResponse(int code, PolicyCollection data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PolicyCollection getData() {
        return data;
    }

    public void setData(PolicyCollection data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
