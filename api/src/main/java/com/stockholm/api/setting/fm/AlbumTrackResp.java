package com.stockholm.api.setting.fm;


public class AlbumTrackResp {


    /**
     * success : true
     * msg : 该频道的播放记录
     * data : {"trackId":234234,"trackTitle":"有意思","albumId":123123,"albumTitle":"在吗","anchor":"县积极","progress":20}
     */

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
        /**
         * trackId : 234234
         * trackTitle : 有意思
         * albumId : 123123
         * albumTitle : 在吗
         * anchor : 县积极
         * progress : 20
         */

        private int trackId;
        private String trackTitle;
        private int albumId;
        private String albumTitle;
        private String anchor;
        private int progress;
        private int index;

        public void setIndex(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public int getTrackId() {
            return trackId;
        }

        public void setTrackId(int trackId) {
            this.trackId = trackId;
        }

        public String getTrackTitle() {
            return trackTitle;
        }

        public void setTrackTitle(String trackTitle) {
            this.trackTitle = trackTitle;
        }

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public String getAlbumTitle() {
            return albumTitle;
        }

        public void setAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
        }

        public String getAnchor() {
            return anchor;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }
    }
}
