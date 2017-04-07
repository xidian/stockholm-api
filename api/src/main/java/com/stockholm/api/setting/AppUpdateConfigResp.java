package com.stockholm.api.setting;

import com.google.gson.Gson;

public class AppUpdateConfigResp {

    private boolean success;
    private String msg;
    private String data;

    public AppUpdateConfigResp(String msg, String data) {
        setSuccess(true);
        setMsg(msg);
        setData(data);
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}