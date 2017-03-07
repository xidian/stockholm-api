package com.stockholm.api.setting.fm;

public class FmPlayControlReq {

    private PlayBean play;

    public PlayBean getPlay() {
        return play;
    }

    public void setPlay(PlayBean play) {
        this.play = play;
    }

    public static class PlayBean {

        private int trackIndex;
        private String trackId;
        private String playId;
        private int playType;
        private int volume;
        private int playState;
        private String trackName;
        private String coverUrl;
        private String AlbumName;

        public int getTrackIndex() {
            return trackIndex;
        }

        public void setTrackIndex(int trackIndex) {
            this.trackIndex = trackIndex;
        }

        public String getTrackId() {
            return trackId;
        }

        public void setTrackId(String trackId) {
            this.trackId = trackId;
        }

        public String getPlayId() {
            return playId;
        }

        public void setPlayId(String playId) {
            this.playId = playId;
        }

        public int getPlayType() {
            return playType;
        }

        public void setPlayType(int playType) {
            this.playType = playType;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getPlayState() {
            return playState;
        }

        public void setPlayState(int playState) {
            this.playState = playState;
        }

        public String getTrackName() {
            return trackName;
        }

        public void setTrackName(String trackName) {
            this.trackName = trackName;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getAlbumName() {
            return AlbumName;
        }

        public void setAlbumName(String albumName) {
            AlbumName = albumName;
        }
    }
}
