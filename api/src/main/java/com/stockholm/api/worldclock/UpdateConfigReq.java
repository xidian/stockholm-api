package com.stockholm.api.worldclock;


public class UpdateConfigReq {
    private ConfigBean worldclock;

    public UpdateConfigReq(ConfigBean worldclock) {
        this.worldclock = worldclock;
    }

    public ConfigBean getWorldclock() {
        return worldclock;
    }

    public void setWorldclock(ConfigBean worldclock) {
        this.worldclock = worldclock;
    }

}