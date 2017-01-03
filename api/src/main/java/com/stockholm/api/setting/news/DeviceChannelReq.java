package com.stockholm.api.setting.news;

public class DeviceChannelReq {

    private String uuid;

    public DeviceChannelReq(String uuid) {
        setUuid(uuid);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
