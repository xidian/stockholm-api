package com.stockholm.api.setting.album;


import java.util.List;

public class AlbumUserPathresp {


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
        private List<String> downloadUrls;

        public List<String> getDownloadUrls() {
            return downloadUrls;
        }

        public void setDownloadUrls(List<String> downloadUrls) {
            this.downloadUrls = downloadUrls;
        }
    }
}
