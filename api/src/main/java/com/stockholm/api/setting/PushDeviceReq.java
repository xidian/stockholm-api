package com.stockholm.api.setting;

/**
 * Created by caorh on 17-3-25.
 */

public class PushDeviceReq {

    /**
     * whisper : your-content
     * extras : {"order":1,"name":"package name"}
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
         * order : 1
         * name : package name
         */

        private int order;
        private String name;

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
