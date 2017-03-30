package com.stockholm.api;


public class CommonPushReq {
    private String whisper;
    private PushMessage extras;

    public CommonPushReq() {
    }

    public CommonPushReq(PushMessage extras) {
        this.extras = extras;
    }

    public String getWhisper() {
        return whisper;
    }

    public void setWhisper(String whisper) {
        this.whisper = whisper;
    }

    public PushMessage getExtras() {
        return extras;
    }

    public void setExtras(PushMessage extras) {
        this.extras = extras;
    }
}