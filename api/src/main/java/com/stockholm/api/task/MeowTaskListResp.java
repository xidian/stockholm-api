package com.stockholm.api.task;


import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.util.List;

public class MeowTaskListResp {

    private boolean success;
    private String msg;
    private List<MeowTaskBean> data;
    private LocalTime startTime;
    private int repeatType;
    private String repeatValue;
    private String packageName;
    private LocalDateTime updateAt;

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

    public List<MeowTaskBean> getData() {
        return data;
    }

    public void setData(List<MeowTaskBean> data) {
        this.data = data;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
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

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
