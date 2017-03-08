package com.stockholm.api.store;


public class AppDetailResp {
    private boolean success;
    private String msg;
    private DescBean data;

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

    public DescBean getData() {
        return data;
    }

    public void setData(DescBean data) {
        this.data = data;
    }

    public static class DescBean {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}