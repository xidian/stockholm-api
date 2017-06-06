package com.stockholm.api.task;


import java.util.List;

public class MeowTaskListResp {

    private boolean success;
    private String msg;
    private int taskConfigId;
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

    public int getTaskConfigId() {
        return taskConfigId;
    }

    public void setTaskConfigId(int taskConfigId) {
        this.taskConfigId = taskConfigId;
    }


}
