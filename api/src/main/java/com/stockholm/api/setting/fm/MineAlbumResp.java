package com.stockholm.api.setting.fm;

import java.util.List;

public class MineAlbumResp {


    /**
     * success : true
     * msg : 您订阅的专辑
     * data : [{"albumId":123,"title":"title","coverUrl":"m.com","subscribeDate":"2017-06-22T14:30:20.000+08:00"}]
     * page : {"page":1,"nextPage":2,"totalPages":3}
     */

    private boolean success;
    private String msg;
    private PageBean page;
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

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PageBean {
        /**
         * page : 1
         * nextPage : 2
         * totalPages : 3
         */

        private int page;
        private int nextPage;
        private int totalPages;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }
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
        private String subscribeDate;
        private String anchor;

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

        public String getAnchor() {
            return anchor;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }
    }
}
