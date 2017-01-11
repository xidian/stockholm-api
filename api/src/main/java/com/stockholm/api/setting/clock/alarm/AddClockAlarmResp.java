package com.stockholm.api.setting.clock.alarm;


public class AddClockAlarmResp {
    private boolean success;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int clockAlarmId;

        public int getClockAlarmId() {
            return clockAlarmId;
        }

        public void setClockAlarmId(int clockAlarmId) {
            this.clockAlarmId = clockAlarmId;
        }
    }
}
