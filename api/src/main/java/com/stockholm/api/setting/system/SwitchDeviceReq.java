package com.stockholm.api.setting.system;


public class SwitchDeviceReq {
    private DeviceBean device;

    public SwitchDeviceReq(String uuid) {
        setDevice(new DeviceBean(uuid));
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public static class DeviceBean {
        private String uuid;

        public DeviceBean(String uuid) {
            setUuid(uuid);
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }
    }

}