package com.stockholm.api.setting.fm;

public class UpdateTrackReq {


    /**
     * track : {"albumTitle":"ghjh","trackId":78988,"trackTitle":"hjhhj","coverUrl":"hh.com","anchor":"liusining","progress":"20","index":0}
     * media : {"playState":0,"extra":"test"}
     */

    private TrackBean track;
    private MediaBean media;

    public TrackBean getTrack() {
        return track;
    }

    public void setTrack(TrackBean track) {
        this.track = track;
    }

    public MediaBean getMedia() {
        return media;
    }

    public void setMedia(MediaBean media) {
        this.media = media;
    }

    public static class TrackBean {
        /**
         * albumTitle : ghjh
         * trackId : 78988
         * trackTitle : hjhhj
         * coverUrl : hh.com
         * anchor : liusining
         * progress : 20
         * index : 0
         */

        private String albumTitle;
        private int trackId;
        private String trackTitle;
        private String coverUrl;
        private String anchor;
        private String progress;
        private int index;

        public String getAlbumTitle() {
            return albumTitle;
        }

        public void setAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
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

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getAnchor() {
            return anchor;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public String getProgress() {
            return progress;
        }

        public void setProgress(String progress) {
            this.progress = progress;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public static class MediaBean {
        /**
         * playState : 0
         * extra : test
         */

        private int playState;
        private String extra;

        public int getPlayState() {
            return playState;
        }

        public void setPlayState(int playState) {
            this.playState = playState;
        }

        public String getExtra() {
            return extra;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }
    }
}
