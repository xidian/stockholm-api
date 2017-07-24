package com.stockholm.api.setting.clock;


import java.io.Serializable;

public class AlarmBean implements Serializable {
    private int alarmId;
    private String name;
    private int repeatType;
    private String ring;
    private String time;
    private boolean status;
    private String repeatValue;

    private String taskName;
    private int taskConfigId;

    public AlarmBean() {
    }

    public AlarmBean(int alarmId, String name, int repeatType, String ring, String time,
                     boolean status, String repeatValue, String taskName, int taskConfigId) {
        setAlarmId(alarmId);
        setName(name);
        setRepeatType(repeatType);
        setRing(ring);
        setTime(time);
        setStatus(status);
        setRepeatValue(repeatValue);
        setTaskName(taskName);
        setTaskConfigId(taskConfigId);
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRepeatValue() {
        return repeatValue;
    }

    public void setRepeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskConfigId() {
        return taskConfigId;
    }

    public void setTaskConfigId(int taskConfigId) {
        this.taskConfigId = taskConfigId;
    }

}