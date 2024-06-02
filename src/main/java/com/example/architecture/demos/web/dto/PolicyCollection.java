package com.example.architecture.demos.web.dto;

import com.example.architecture.demos.web.entity.PolicyJSON;

import java.util.List;

public class PolicyCollection {
    List<PolicyJSON> policy;

    public PolicyCollection(List<PolicyJSON> policy) {
        this.policy = policy;
    }

    public List<PolicyJSON> getPolicy() {
        return policy;
    }

    public void setPolicy(List<PolicyJSON> policy) {
        this.policy = policy;
    }
}
