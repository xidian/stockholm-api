package com.stockholm.api.store;


import com.google.gson.Gson;

public class AppDetailResp {
    private boolean success;
    private String msg;
    private DetailBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DetailBean getData() {
        return data;
    }

    public void setData(DetailBean data) {
        this.data = data;
    }

    public static class DetailBean {
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

        public static DetailBean get(String json) {
            return new Gson().fromJson(json, DetailBean.class);
        }
    }

}