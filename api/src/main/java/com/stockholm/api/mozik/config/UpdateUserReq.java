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
        private UserBean user;

        public UpdateBean(int userId) {
            this.user = new UserBean(userId);
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }
    }

}