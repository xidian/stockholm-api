package com.stockholm.api.mozik.api;


public class UpdateCollectionResp extends MozikBaseResp {
    private boolean success;

    @Override
    public boolean isSuccess() {
        return success && code == 200;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}