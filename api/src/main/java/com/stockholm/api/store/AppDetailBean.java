package com.stockholm.api.store;


import com.stockholm.api.base.BaseDataBean;

public class AppDetailBean extends BaseDataBean{
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

}