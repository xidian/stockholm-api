package com.stockholm.api.timer;

import android.os.Parcel;
import android.os.Parcelable;

public class TimerBean implements Parcelable{

    private int id;
    private String name;
    private int interval;

    public TimerBean(int id, String name, int interval) {
        this.id = id;
        this.name = name;
        this.interval = interval;
    }

    public TimerBean() {
    }

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

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.interval);
    }

    protected TimerBean(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.interval = in.readInt();
    }

    public static final Creator<TimerBean> CREATOR = new Creator<TimerBean>() {
        @Override
        public TimerBean createFromParcel(Parcel source) {
            return new TimerBean(source);
        }

        @Override
        public TimerBean[] newArray(int size) {
            return new TimerBean[size];
        }
    };
}
