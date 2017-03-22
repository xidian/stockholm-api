package com.stockholm.api.setting;


public class UpdateAppStateResp {
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
        private boolean isHidden;

        public boolean isHidden() {
            return isHidden;
        }

        public void setHidden(boolean hidden) {
            isHidden = hidden;
        }
    }

}