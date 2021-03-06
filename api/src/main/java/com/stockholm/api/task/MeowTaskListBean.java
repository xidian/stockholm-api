package com.stockholm.api.task;


import java.util.List;

public class MeowTaskListBean {

    private int taskConfigId;
    private List<MeowTaskBean> task;
    private String startTime;
    private int repeatType;
    private String repeatValue;
    private String updatedAt;
    private boolean open;

    public int getTaskConfigId() {
        return taskConfigId;
    }

    public void setTaskConfigId(int taskConfigId) {
        this.taskConfigId = taskConfigId;
    }

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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }
}
