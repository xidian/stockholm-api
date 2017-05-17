package com.stockholm.api.store;


import com.google.gson.Gson;

import java.util.List;

public class StoreTopAppsResp {
    private boolean success;
    private String msg;
    private List<AppBean> data;

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

    public List<AppBean> getData() {
        return data;
    }

    public void setData(List<AppBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static StoreTopAppsResp get(String json) {
        return new Gson().fromJson(json, StoreTopAppsResp.class);
    }

}