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

        private ConfigBean config;
        private List<DownloadUrlsBean> downloadUrls;

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public List<DownloadUrlsBean> getDownloadUrls() {
            return downloadUrls;
        }

        public void setDownloadUrls(List<DownloadUrlsBean> downloadUrls) {
            this.downloadUrls = downloadUrls;
        }

        public static class ConfigBean {
        }

        public static class DownloadUrlsBean {

            private String url;
            private String timestamp;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }
        }
    }
}
