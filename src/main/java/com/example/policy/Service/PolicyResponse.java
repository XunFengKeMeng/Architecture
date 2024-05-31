package com.example.policy.Service;

import javax.persistence.Entity;

public class PolicyResponse {

    private String title;
    private String html;
    private String content;
    private String number;
    private String sourceUrl;
    private String fileUrl;
    private int bookmark;

    public PolicyResponse(String title, String html, String content, String number, String sourceUrl, String fileUrl, int bookmark) {
        this.title = title;
        this.html = html;
        this.content = content;
        this.number = number;
        this.sourceUrl = sourceUrl;
        this.fileUrl = fileUrl;
        this.bookmark = bookmark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public int getBookmark() {
        return bookmark;
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }
}
