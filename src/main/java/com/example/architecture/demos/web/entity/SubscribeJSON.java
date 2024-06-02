package com.example.architecture.demos.web.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubscribeJSON {
    List<String> sub;

    public SubscribeJSON(String sub) {
        if("[]".equals(sub)) {
            this.sub = new ArrayList<>();
        } else {
            this.sub = Arrays.asList(sub.split(","));
        }
    }

    public SubscribeJSON() {
    }

    public List<String> getSub() {
        return sub;
    }

    public void setSub(String sub)  {
        if("[]".equals(sub)) {
            this.sub = new ArrayList<>();
        } else {
            this.sub = Arrays.asList(sub.split(","));
        }
    }
}
