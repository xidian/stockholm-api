package com.stockholm.api.setting.clock;


public class DeviceClockConfigReq {
    private String uuid;

    public DeviceClockConfigReq(String uuid) {
        setUuid(uuid);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
