package com.stockholm.api.setting.music;

public class MobileControlReq {

    private String whisper;
    private ExtrasBean extras;

    public String getWhisper() {
        return whisper;
    }

    public void setWhisper(String whisper) {
        this.whisper = whisper;
    }

    public ExtrasBean getExtras() {
        return extras;
    }

    public void setExtras(ExtrasBean extras) {
        this.extras = extras;
    }

    public static class ExtrasBean {

        private String order;
        private String play;

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getPlay() {
            return play;
        }

        public void setPlay(String play) {
            this.play = play;
        }
    }
}
