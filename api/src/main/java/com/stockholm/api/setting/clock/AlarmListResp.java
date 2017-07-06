package com.stockholm.api.setting.clock;


public class AlarmListResp {


    /**
     * alarmId : 12
     * name : wer
     * repeatType : 0
     * ring : 1
     * status : 0
     * taskName : jkjj
     * time : 12:12
     * taskConfigId : 1
     */

    private boolean status;
    private int alarmId;
    private int repeatType;
    private int taskConfigId;
    private String name;
    private String ring;
    private String taskName;
    private String time;
    private String repeatValue;

    public String getRepeatValue() {
        return repeatValue;
    }

    public void setRepeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
    }

    public int getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(int alarmId) {
        this.alarmId = alarmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(int repeatType) {
        this.repeatType = repeatType;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTaskConfigId() {
        return taskConfigId;
    }

    public void setTaskConfigId(int taskConfigId) {
        this.taskConfigId = taskConfigId;
    }
}