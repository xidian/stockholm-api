package com.stockholm.api.timer;

public class CreateUpdateReq {


    /**
     * timer : {"name":"洗澡","interval":40}
     */

    private TimerBean timer;

    public TimerBean getTimer() {
        return timer;
    }

    public void setTimer(TimerBean timer) {
        this.timer = timer;
    }

}
