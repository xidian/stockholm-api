package com.stockholm.api.setting.clock.alarm;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GetClockAlarmResp {
    private boolean success;
    private String msg;
    private List<AlarmBean> data = new ArrayList<>();

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

    public List<AlarmBean> getData() {
        return data;
    }

    public void setData(List<AlarmBean> data) {
        this.data = data;
    }

    public static class AlarmBean implements Serializable {
        private int clockAlarmId;
        private String name;
        private int repeatType;
        private String ring;
        private String time;
        private boolean status;

        public int getClockAlarmId() {
            return clockAlarmId;
        }

        public void setClockAlarmId(int clockAlarmId) {
            this.clockAlarmId = clockAlarmId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRepeatType() {
            return repeatType;
        }

        public void setRepeatType(int repeatType) {
            this.repeatType = repeatType;
        }

        public String getRing() {
            return ring;
        }

        public void setRing(String ring) {
            this.ring = ring;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }

}
