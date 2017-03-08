package com.stockholm.api.store;


import java.util.List;

public class AppListResp {
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

}