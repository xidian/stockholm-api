package com.stockholm.api.setting.task;

import java.util.List;

public class MineTask {


    /**
     * id : 314
     * name : 上班
     * startTime : 11:34
     * repeatType : 1
     * repeatValue : 1,2,3,4,5
     * tasks : [{"taskId":"djkitF","packageName":"com.stockholm.clock"},{"taskId":"ux8cy7","packageName":"com.stockholm.calendar"},{"taskId":"XGRYFf","packageName":"com.stockholm.weather"},{"taskId":"f66qEE","packageName":"com.stockholm.news"},{"taskId":"Tz0XLe","packageName":"com.stockholm.mozik"}]
     * duration : 110
     * enableManual : true
     * invalidTime : 12:04
     * open : false
     */

    private int id;
    private String name;
    private String startTime;
    private int repeatType;
    private String repeatValue;
    private String duration;
    private boolean enableManual;
    private String invalidTime;
    private boolean open;
    private List<TaskBean> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isEnableManual() {
        return enableManual;
    }

    public void setEnableManual(boolean enableManual) {
        this.enableManual = enableManual;
    }

    public String getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<TaskBean> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskBean> tasks) {
        this.tasks = tasks;
    }

}
