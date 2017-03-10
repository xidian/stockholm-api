package com.stockholm.api.store;


public class StoreCommonPushReq {
    private String whisper;
    private String extras;

    public StoreCommonPushReq(String extras) {
        this.extras = extras;
    }

    public StoreCommonPushReq(String whisper, String extras) {
        this.whisper = whisper;
        this.extras = extras;
    }

    public String getWhisper() {
        return whisper;
    }

    public void setWhisper(String whisper) {
        this.whisper = whisper;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

}