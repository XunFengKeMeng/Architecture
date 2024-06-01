package com.example.policy.dto;

import com.example.policy.Service.PolicyResponse;
import com.example.policy.entity.Policy;

public class PolicyResponse1 {
    private int code;
    private String msg;

    private PolicyResponse data;


    public PolicyResponse1(int code, String msg, PolicyResponse data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public PolicyResponse getData() {
        return data;
    }

    public void setData(PolicyResponse data) {
        this.data = data;
    }
}
