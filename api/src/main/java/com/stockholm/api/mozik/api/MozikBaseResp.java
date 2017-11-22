package com.stockholm.api.mozik.api;


public class MozikBaseResp {

    protected int code;
    private String error;
    private String des;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public boolean isSuccess() {
        return code == 200;
    }

}