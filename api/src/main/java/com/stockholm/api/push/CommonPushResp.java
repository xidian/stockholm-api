package com.stockholm.api.push;


import com.google.gson.Gson;

public class CommonPushResp {
    private boolean success;
    private String msg;

    public CommonPushResp(String msg) {
        setSuccess(true);
        setMsg(msg);
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static CommonPushResp get(String json) {
        return new Gson().fromJson(json, CommonPushResp.class);
    }

}