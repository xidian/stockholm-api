package com.stockholm.api.setting.news;


public class UserChannelBean {
    private long categoryId;
    private String categoryName;
    private boolean available = true;
    private long newsId;
    private int progress;
    private boolean finished;

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

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}