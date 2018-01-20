package com.stockholm.api.calendar;


import java.util.List;

public class CalendarConfigBean {

    private List<EventBean> events;
    private long syncTime;

    public List<EventBean> getEvents() {
        return events;
    }

    public void setEvents(List<EventBean> events) {
        this.events = events;
    }

    public long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(long syncTime) {
        this.syncTime = syncTime;
    }

}