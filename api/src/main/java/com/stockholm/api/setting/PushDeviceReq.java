package com.stockholm.api.setting;

import com.stockholm.api.PushMessage;

/**
 * Created by caorh on 17-3-25.
 */

public class PushDeviceReq {

    /**
     * whisper : your-content
     * extras : {"order":1,"name":"package name"}
     */

    private String whisper;
    private PushMessage extras;

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
