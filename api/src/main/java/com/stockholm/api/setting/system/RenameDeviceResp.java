package com.stockholm.api.setting.system;

public class RenameDeviceResp {

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

        private String clockName;

        public String getClockName() {
            return clockName;
        }

        public void setClockName(String clockName) {
            this.clockName = clockName;
        }
    }
}
