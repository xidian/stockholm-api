package com.stockholm.api.calendar;


import java.util.List;

public class SyncEventReq {

    private List<EventBean> events;
    private long syncTime;

    public SyncEventReq(List<EventBean> events, long syncTime) {
        this.events = events;
        this.syncTime = syncTime;
    }

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