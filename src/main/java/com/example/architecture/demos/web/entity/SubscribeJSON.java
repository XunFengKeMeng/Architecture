package com.example.architecture.demos.web.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubscribeJSON {
    List<String> sub;

    @JsonCreator
    public SubscribeJSON(@JsonProperty("sub") String sub) {
        if (sub == null || sub.isEmpty()) {
            this.sub = new ArrayList<>();
        } else {
            this.sub = Arrays.asList(sub.replaceAll("\\[|\\]|\\s", "").split(","));
        }
    }

    public SubscribeJSON() {
    }

    public List<String> getSub() {
        return sub;
    }

    public void setSub(String sub) {
        if (sub == null || sub.isEmpty()) {
            this.sub = new ArrayList<>();
        } else {
            this.sub = Arrays.asList(sub.replaceAll("\\[|\\]|\\s", "").split(","));
        }
    }
}
