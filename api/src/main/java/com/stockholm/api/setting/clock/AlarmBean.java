package com.stockholm.api.setting.clock;


import java.io.Serializable;

public class AlarmBean implements Serializable {
    private int clockAlarmId;
    private String name;
    private int repeatType;
    private String ring;
    private String time;
    private boolean status;
    private String repeat;

    private int taskConfigId;
    private String taskName;

    public AlarmBean() {
    }

    public AlarmBean(int clockAlarmId, String name, int repeatType, String ring, String time,
                     boolean status, String repeat, String taskName, int taskConfigId) {
        setClockAlarmId(clockAlarmId);
        setName(name);
        setRepeatType(repeatType);
        setRing(ring);
        setTime(time);
        setStatus(status);
        setRepeat(repeat);
        setTaskName(taskName);
        setTaskConfigId(taskConfigId);
    }

    public int getClockAlarmId() {
        return clockAlarmId;
    }

    public void setClockAlarmId(int clockAlarmId) {
        this.clockAlarmId = clockAlarmId;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
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