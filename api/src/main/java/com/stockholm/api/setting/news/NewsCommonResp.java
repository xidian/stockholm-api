package com.stockholm.api.setting.news;


public class NewsCommonResp {
    private boolean success;
    private String msg;

    public NewsCommonResp(boolean success, String msg) {
        setSuccess(success);
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

}