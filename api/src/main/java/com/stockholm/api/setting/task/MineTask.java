package com.stockholm.api.setting.task;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class MineTask implements Parcelable {


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
    private int templateType;

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

    public int getTemplateType() {
        return templateType;
    }

    public void setTemplateType(int templateType) {
        this.templateType = templateType;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.startTime);
        dest.writeInt(this.repeatType);
        dest.writeString(this.repeatValue);
        dest.writeString(this.duration);
        dest.writeByte(this.enableManual ? (byte) 1 : (byte) 0);
        dest.writeString(this.invalidTime);
        dest.writeByte(this.open ? (byte) 1 : (byte) 0);
        dest.writeList(this.tasks);
        dest.writeInt(this.templateType);
    }

    public MineTask() {
    }

    protected MineTask(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.startTime = in.readString();
        this.repeatType = in.readInt();
        this.repeatValue = in.readString();
        this.duration = in.readString();
        this.enableManual = in.readByte() != 0;
        this.invalidTime = in.readString();
        this.open = in.readByte() != 0;
        this.tasks = new ArrayList<TaskBean>();
        in.readList(this.tasks, TaskBean.class.getClassLoader());
        this.templateType = in.readInt();
    }

    public static final Creator<MineTask> CREATOR = new Creator<MineTask>() {
        @Override
        public MineTask createFromParcel(Parcel source) {
            return new MineTask(source);
        }

        @Override
        public MineTask[] newArray(int size) {
            return new MineTask[size];
        }
    };

    @Override
    public MineTask clone() throws CloneNotSupportedException {
        MineTask mineTask = new MineTask();
        mineTask.setRepeatValue(this.getRepeatValue());
        mineTask.setRepeatType(this.getRepeatType());
        mineTask.setOpen(this.isOpen());
        mineTask.setDuration(this.getDuration());
        mineTask.setEnableManual(this.isEnableManual());
        mineTask.setId(this.getId());
        mineTask.setName(this.getName());
        mineTask.setInvalidTime(this.getInvalidTime());
        mineTask.setTemplateType(this.getTemplateType());
        mineTask.setStartTime(this.getStartTime());
        List<TaskBean> taskBeans = new ArrayList<>();
        taskBeans.addAll(this.getTasks());
        mineTask.setTasks(taskBeans);
        return mineTask;
    }
}
