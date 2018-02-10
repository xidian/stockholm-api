package com.stockholm.api.calendar;


import java.io.Serializable;

public class EventBean implements Serializable {
    private long eventId;
    private String name;
    private String time;
    private boolean solar;
    private String repeatValue;
    private int repeatType;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isSolar() {
        return solar;
    }

    public void setSolar(boolean solar) {
        this.solar = solar;
    }

    public String getRepeatValue() {
        return repeatValue;
    }

    public void setRepeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
    }

    public int getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(int repeatType) {
        this.repeatType = repeatType;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        EventBean other = (EventBean) obj;
        return other.getName().equals(this.getName())
                && other.getRepeatType() == this.getRepeatType()
                && other.getTime().equals(this.getTime())
                && other.getRepeatValue().equals(this.getRepeatValue());
    }
}