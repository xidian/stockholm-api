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

        private String playId;
        private int type;
        private int index;
        private int volume;
        private int playState;

        public String getPlayId() {
            return playId;
        }

        public void setPlayId(String playId) {
            this.playId = playId;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
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
    }
}
