package com.ieg.myblog.models;

public class PostText {
    private String user;
    private String title;
    private String body;
    private long time;

    public PostText() {
    }

    public PostText(String user, String title, String body, long time) {
        this.user = user;
        this.title = title;
        this.body = body;
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
