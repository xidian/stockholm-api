package com.stockholm.api.setting.fm;

public class UpdateTrackReq {


    /**
     * track : {"albumTitle":"ghjh","trackId":78988,"trackTitle":"hjhhj","coverUrl":"hh.com","anchor":"liusining","progress":"20"}
     */

    private TrackBean track;

    public TrackBean getTrack() {
        return track;
    }

    public void setTrack(TrackBean track) {
        this.track = track;
    }

    public static class TrackBean {
        /**
         * albumTitle : ghjh
         * trackId : 78988
         * trackTitle : hjhhj
         * coverUrl : hh.com
         * anchor : liusining
         * progress : 20
         */

        private String albumTitle;
        private int trackId;
        private String trackTitle;
        private String coverUrl;
        private String anchor;
        private String progress;

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
    }
}
