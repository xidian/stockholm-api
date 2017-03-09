package com.stockholm.api.store;


public class GetUserCommentResp {
    private boolean success;
    private String msg;
    private AppCommentBean data;

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

    public AppCommentBean getData() {
        return data;
    }

    public void setData(AppCommentBean data) {
        this.data = data;
    }

}