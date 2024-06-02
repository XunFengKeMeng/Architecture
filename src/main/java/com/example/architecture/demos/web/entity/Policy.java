package com.example.architecture.demos.web.entity;


public class Policy {
  private long id;
  private int policy_id;
  private String title;
  private String source;
  private String sourceurl;
  private String fileurl;
  private String pubDate;
  private String number;
  private String level;
  private String content;

  public Policy(int policy_id, String title, String source, String sourceurl, String fileurl, String pubDate, String number, String level, String content) {
    this.policy_id = policy_id;
    this.title = title;
    this.source = source;
    this.sourceurl = sourceurl;
    this.fileurl = fileurl;
    this.pubDate = pubDate;
    this.number = number;
    this.level = level;
    this.content = content;
  }

  public Policy(long id, int policy_id, String title, String source, String sourceurl, String fileurl, String pubDate, String number, String level, String content) {
    this.id = id;
    this.policy_id = policy_id;
    this.title = title;
    this.source = source;
    this.sourceurl = sourceurl;
    this.fileurl = fileurl;
    this.pubDate = pubDate;
    this.number = number;
    this.level = level;
    this.content = content;
  }

  public Policy() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getPolicy_id() {
    return policy_id;
  }

  public void setPolicy_id(int policy_id) {
    this.policy_id = policy_id;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getSourceurl() {
    return sourceurl;
  }

  public void setSourceurl(String sourceurl) {
    this.sourceurl = sourceurl;
  }

  public String getFileurl() {
    return fileurl;
  }

  public void setFileurl(String fileurl) {
    this.fileurl = fileurl;
  }

  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
