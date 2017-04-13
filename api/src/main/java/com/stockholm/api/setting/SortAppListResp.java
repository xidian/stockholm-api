package com.stockholm.api.setting;


import com.google.gson.Gson;

import java.util.List;

public class SortAppListResp {

    private boolean success;
    private String msg;
    private List<SortAppDataBean> data;

    public SortAppListResp(boolean success, String msg, List<SortAppDataBean> data) {
        setSuccess(success);
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

    public List<SortAppDataBean> getData() {
        return data;
    }

    public void setData(List<SortAppDataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static SortAppListResp get(String json) {
        return new Gson().fromJson(json, SortAppListResp.class);
    }

}