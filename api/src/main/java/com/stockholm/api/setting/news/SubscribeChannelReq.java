package com.stockholm.api.setting.news;


public class SubscribeChannelReq {
    private long categoryId;
    private boolean subscribed;

    public SubscribeChannelReq(long categoryId, boolean subscribed) {
        setCategoryId(categoryId);
        setSubscribed(subscribed);
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

}