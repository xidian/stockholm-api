package com.stockholm.api.store;


import com.stockholm.api.PushMessage;

public class StoreCommonPushReq {
    private String whisper;
    private PushMessage extras;

    public StoreCommonPushReq(PushMessage extras) {
        setExtras(extras);
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