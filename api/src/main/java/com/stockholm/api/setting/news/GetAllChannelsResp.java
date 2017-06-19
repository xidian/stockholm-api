package com.stockholm.api.setting.news;


import java.util.List;

public class GetAllChannelsResp {
    private boolean success;
    private String msg;
    private List<ChannelBean> data;

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

    public List<ChannelBean> getData() {
        return data;
    }

    public void setData(List<ChannelBean> data) {
        this.data = data;
    }

}