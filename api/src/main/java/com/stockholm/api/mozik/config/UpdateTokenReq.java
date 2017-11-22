package com.stockholm.api.mozik.config;


public class UpdateTokenReq {

    private UpdateBean mozik;

    public UpdateTokenReq(String token) {
        this.mozik = new UpdateBean(token);
    }

    public UpdateBean getMozik() {
        return mozik;
    }

    public void setMozik(UpdateBean mozik) {
        this.mozik = mozik;
    }

    public static class UpdateBean {
        private String token;

        public UpdateBean(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

}