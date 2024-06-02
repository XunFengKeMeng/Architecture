package com.example.architecture.demos.web.entity;

public class Bookemark {
    private long bookmarkId;
    private Long policyId;
    private String username;

    public Bookemark(long bookmarkId, Long policyId, String username) {
        this.bookmarkId = bookmarkId;
        this.policyId = policyId;
        this.username = username;
    }

    public long getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(long bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
