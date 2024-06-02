package com.example.architecture.demos.web.entity;

public class UserInfo {
    private String email;
    private String name;
    private String occup;

    public UserInfo(String email, String name, String occup) {
        this.email = email;
        this.name = name;
        this.occup = occup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccup() {
        return occup;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }
}
