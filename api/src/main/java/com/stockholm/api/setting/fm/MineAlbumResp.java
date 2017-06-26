package com.stockholm.api.setting.fm;

import java.util.List;

public class MineAlbumResp {


    /**
     * success : true
     * msg : 您订阅的专辑
     * data : [{"albumId":123,"title":"title","coverUrl":"m.com","subscribeDate":"2017-06-22T14:30:20.000+08:00"}]
     */

    private boolean success;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * albumId : 123
         * title : title
         * coverUrl : m.com
         * subscribeDate : 2017-06-22T14:30:20.000+08:00
         */

        private int albumId;
        private String title;
        private String coverUrl;
        private String anchor;
        private String subscribeDate;

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getSubscribeDate() {
            return subscribeDate;
        }

        public void setSubscribeDate(String subscribeDate) {
            this.subscribeDate = subscribeDate;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public String getAnchor() {
            return anchor;
        }
    }
}
