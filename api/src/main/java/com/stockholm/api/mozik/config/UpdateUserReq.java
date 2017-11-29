package com.stockholm.api.mozik.config;


public class UpdateUserReq {

    private UpdateBean mozik;

    public UpdateUserReq(int userId) {
        this.mozik = new UpdateBean(userId);
    }

    public UpdateBean getMozik() {
        return mozik;
    }

    public void setMozik(UpdateBean mozik) {
        this.mozik = mozik;
    }

    public static class UpdateBean {
        private int userId;

        public UpdateBean(int userId) {
            this.userId = userId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }

}