package com.stockholm.api.task;

public class ChangeTaskStatusReq {

   private int taskConfigId;
   private boolean status;

    public int getTaskConfigId() {
        return taskConfigId;
    }

    public void setTaskConfigId(int taskConfigId) {
        this.taskConfigId = taskConfigId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
