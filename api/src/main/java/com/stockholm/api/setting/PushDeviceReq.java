package com.stockholm.api.setting;

/**
 * Created by caorh on 17-3-25.
 */

public class PushDeviceReq {

    /**
     * whisper : your-content
     * extras : {"order":"..."}
     */

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
        /**
         * order : ...
         */

        private String order;

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }
    }
}
