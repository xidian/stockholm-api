package com.stockholm.api.setting.news;


import com.google.gson.Gson;

public class NewsExtraBean {
    private String postDate;
    private long categoryId;

    public NewsExtraBean(String postDate, long categoryId) {
        this.postDate = postDate;
        this.categoryId = categoryId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static NewsExtraBean get(String json) {
        return new Gson().fromJson(json, NewsExtraBean.class);
    }

}