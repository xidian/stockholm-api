package com.stockholm.api.setting.fm;

public class SubscribeStateResp {


    /**
     * success : true
     * msg : 订阅信息
     * data : {"subscribed":true,"track":{"trackId":234234,"trackTitle":"天气不错","albumId":123123,"albumTitle":"老张张","anchor":"小机场","progress":80}}
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
         * subscribed : true
         * track : {"trackId":234234,"trackTitle":"天气不错","albumId":123123,"albumTitle":"老张张","anchor":"小机场","progress":80}
         */

        private boolean subscribed;
        private TrackBean track;

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public TrackBean getTrack() {
            return track;
        }

        public void setTrack(TrackBean track) {
            this.track = track;
        }

        public static class TrackBean {
            /**
             * trackId : 234234
             * trackTitle : 天气不错
             * albumId : 123123
             * albumTitle : 老张张
             * anchor : 小机场
             * progress : 80
             */

            private int trackId;
            private String trackTitle;
            private int albumId;
            private String albumTitle;
            private String anchor;
            private int progress;

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
}
