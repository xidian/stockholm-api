package com.stockholm.api.setting;


import com.google.gson.Gson;

public class UpdateAppStateResp {
    private boolean success;
    private String msg;
    private DataBean data;

    public UpdateAppStateResp(boolean success, String msg, DataBean data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

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
        public DataBean(boolean isHidden) {
            this.isHidden = isHidden;
        }

        private boolean isHidden;

        public boolean isHidden() {
            return isHidden;
        }

        public void setHidden(boolean hidden) {
            isHidden = hidden;
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static UpdateAppStateResp get(String json) {
        return new Gson().fromJson(json, UpdateAppStateResp.class);
    }

}