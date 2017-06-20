package com.stockholm.api.setting.news;


public class UserChannelBean {
    private long categoryId;
    private String categoryName;
    private boolean available = true;

    public UserChannelBean() {
    }

    public UserChannelBean(long categoryId, String categoryName) {
        setCategoryId(categoryId);
        setCategoryName(categoryName);
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}