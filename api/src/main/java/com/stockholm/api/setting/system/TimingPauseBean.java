package com.stockholm.api.setting.system;


public class TimingPauseBean {

    private int type;
    private long endTime;

    public TimingPauseBean(int type) {
        this.type = type;
    }

    public TimingPauseBean(int type, long endTime) {
        this.type = type;
        this.endTime = endTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

}