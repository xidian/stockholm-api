package com.stockholm.api.audio;

public class UpdateContentReq {

    private MediumBean medium;

    public MediumBean getMedium() {
        return medium;
    }

    public void setMedium(MediumBean medium) {
        this.medium = medium;
    }

    public static class MediumBean {

        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
