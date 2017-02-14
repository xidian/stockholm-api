package com.stockholm.api.setting.calendar;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GetAllEventResp {
    private boolean success;
    private String msg;
    private List<EventBean> data = new ArrayList<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<EventBean> getData() {
        return data;
    }

    public void setData(List<EventBean> data) {
        this.data = data;
    }

    public static class EventBean implements Serializable {
        private int eventId;
        private String name;
        private String time;
        private String repeatValue;
        private int repeatType;

        public int getEventId() {
            return eventId;
        }

        public void setEventId(int eventId) {
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
}
