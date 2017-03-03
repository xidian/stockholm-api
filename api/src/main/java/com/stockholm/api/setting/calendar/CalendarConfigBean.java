package com.stockholm.api.setting.calendar;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CalendarConfigBean {
    private List<EventBean> eventList = new ArrayList<>();

    public CalendarConfigBean(List<EventBean> eventList) {
        setEventList(eventList);
    }

    public List<EventBean> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventBean> eventList) {
        this.eventList = eventList;
    }

    public static class EventBean implements Serializable {
        private long eventId;
        private String name;
        private String time;
        private boolean isSolar;
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
            return isSolar;
        }

        public void setSolar(boolean solar) {
            isSolar = solar;
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
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static CalendarConfigBean get(String config) {
        return new Gson().fromJson(config, CalendarConfigBean.class);
    }

}