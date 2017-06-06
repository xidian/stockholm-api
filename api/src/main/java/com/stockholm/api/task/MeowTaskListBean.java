package com.stockholm.api.task;


import java.util.List;

public class MeowTaskListBean {

    private List<MeowTaskBean> task;
    private String startTime;
    private int repeatType;
    private String repeatValue;
    private String updateAt;

    public List<MeowTaskBean> getTask() {
        return task;
    }

    public void setTask(List<MeowTaskBean> task) {
        this.task = task;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(int repeatType) {
        this.repeatType = repeatType;
    }

    public String getRepeatValue() {
        return repeatValue;
    }

    public void setRepeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
