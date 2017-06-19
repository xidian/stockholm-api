package com.stockholm.api.setting.news;


import java.util.List;

public class NewsConfigResp {

    private boolean success;
    private String msg;
    private List<UserChannelBean> data;

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

    public List<UserChannelBean> getData() {
        return data;
    }

    public void setData(List<UserChannelBean> data) {
        this.data = data;
    }

}