package com.stockholm.api.setting.task;

import android.os.Parcel;
import android.os.Parcelable;

public class TaskBean implements Parcelable{


    /**
     * taskId : f66qEE
     * packageName : com.stockholm.news
     */

    private String taskId;
    private String packageName;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.taskId);
        dest.writeString(this.packageName);
    }

    public TaskBean() {
    }

    protected TaskBean(Parcel in) {
        this.taskId = in.readString();
        this.packageName = in.readString();
    }

    public static final Creator<TaskBean> CREATOR = new Creator<TaskBean>() {
        @Override
        public TaskBean createFromParcel(Parcel source) {
            return new TaskBean(source);
        }

        @Override
        public TaskBean[] newArray(int size) {
            return new TaskBean[size];
        }
    };
}
