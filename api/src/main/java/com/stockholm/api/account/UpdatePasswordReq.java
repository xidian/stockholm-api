package com.stockholm.api.account;


import com.google.gson.annotations.SerializedName;

public class UpdatePasswordReq {

    public UpdatePasswordReq(PasswordBean password) {
        this.password = password;
    }

    /**
     * password : {"old":"asdfasdf","new":"qwerqwer"}
     */



    private PasswordBean password;

    public PasswordBean getPassword() {
        return password;
    }

    public void setPassword(PasswordBean password) {
        this.password = password;
    }

    public static class PasswordBean {

        public PasswordBean(String old, String newX) {
            this.old = old;
            this.newX = newX;
        }

        /**
         * old : asdfasdf
         * new : qwerqwer
         */

        private String old;
        @SerializedName("new")
        private String newX;

        public String getOld() {
            return old;
        }

        public void setOld(String old) {
            this.old = old;
        }

        public String getNewX() {
            return newX;
        }

        public void setNewX(String newX) {
            this.newX = newX;
        }
    }
}
