package com.stockholm.api.task;


import android.os.Parcel;
import android.os.Parcelable;

public class MeowTaskBean implements Parcelable{

    private String packageName;
    private String taskId;
    private int priority;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.packageName);
        dest.writeString(this.taskId);
        dest.writeInt(this.priority);
    }

    public MeowTaskBean() {
    }

    protected MeowTaskBean(Parcel in) {
        this.packageName = in.readString();
        this.taskId = in.readString();
        this.priority = in.readInt();
    }

    public static final Creator<MeowTaskBean> CREATOR = new Creator<MeowTaskBean>() {
        @Override
        public MeowTaskBean createFromParcel(Parcel source) {
            return new MeowTaskBean(source);
        }

        @Override
        public MeowTaskBean[] newArray(int size) {
            return new MeowTaskBean[size];
        }
    };
}
