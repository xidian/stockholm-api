package com.stockholm.api.store;


import com.google.gson.Gson;

import java.util.List;

public class AppCommentResp {
    private boolean success;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<AppCommentBean> comments;

        public List<AppCommentBean> getComments() {
            return comments;
        }

        public void setComments(List<AppCommentBean> comments) {
            this.comments = comments;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        public static DataBean get(String json) {
            return new Gson().fromJson(json, DataBean.class);
        }
    }

}