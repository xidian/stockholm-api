package com.stockholm.api.setting.clock;


public class ClockConfigUpdateReq {
    private ClockConfigBean clock;

    public ClockConfigUpdateReq(ClockConfigBean clock) {
        this.clock = clock;
    }

    public ClockConfigBean getClock() {
        return clock;
    }

    public void setClock(ClockConfigBean clock) {
        this.clock = clock;
    }

}