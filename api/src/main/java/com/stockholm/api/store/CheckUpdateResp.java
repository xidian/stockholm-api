package com.stockholm.api.store;


import java.util.List;

public class CheckUpdateResp {
    private boolean success;
    private String msg;
    private List<UpdateAppBean> data;

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

    public List<UpdateAppBean> getData() {
        return data;
    }

    public void setData(List<UpdateAppBean> data) {
        this.data = data;
    }

    public static class UpdateAppBean {
        private String packageName;
        private String deviceDownloadUrl;

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getDeviceDownloadUrl() {
            return deviceDownloadUrl;
        }

        public void setDeviceDownloadUrl(String deviceDownloadUrl) {
            this.deviceDownloadUrl = deviceDownloadUrl;
        }
    }

}