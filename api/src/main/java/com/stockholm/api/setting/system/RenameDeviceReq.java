package com.stockholm.api.setting.system;

public class RenameDeviceReq {
    private DeviceBean device;

    public RenameDeviceReq(String name) {
        this.device = new DeviceBean(name);
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public static class DeviceBean {
        private String name;

        public DeviceBean(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}