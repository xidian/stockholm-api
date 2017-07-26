package com.stockholm.api.store;


import com.google.gson.Gson;

public class AppDetailBean {
    private String description;
    private long commentsCount;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(long commentsCount) {
        this.commentsCount = commentsCount;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AppDetailBean get(String json) {
        return new Gson().fromJson(json, AppDetailBean.class);
    }

}