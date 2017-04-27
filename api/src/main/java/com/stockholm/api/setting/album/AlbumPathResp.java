package com.stockholm.api.setting.album;

import java.util.List;

public class AlbumPathResp {

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

        private String config;
        private List<String> downloadUrls;

        public String getConfig() {
            return config;
        }

        public void setConfig(String config) {
            this.config = config;
        }

        public List<String> getDownloadUrls() {
            return downloadUrls;
        }

        public void setDownloadUrls(List<String> downloadUrls) {
            this.downloadUrls = downloadUrls;
        }
    }
}
