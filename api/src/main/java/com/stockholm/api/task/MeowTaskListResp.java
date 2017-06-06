package com.stockholm.api.task;


import java.util.List;

public class MeowTaskListResp {

    private boolean success;
    private String msg;
    private List<MeowTaskListBean> data;

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


    public List<MeowTaskListBean> getData() {
        return data;
    }

    public void setData(List<MeowTaskListBean> data) {
        this.data = data;
    }
}
