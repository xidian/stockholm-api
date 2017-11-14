package com.stockholm.api.bind;


public class UpdateDisplayStateReq {
    private DeviceBean device;

    public UpdateDisplayStateReq(boolean enableAutoDisplay) {
        this.device = new DeviceBean(enableAutoDisplay);
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public static class DeviceBean {
        private boolean enableAutoDisplay;

        public DeviceBean(boolean enableAutoDisplay) {
            this.enableAutoDisplay = enableAutoDisplay;
        }

        public boolean isEnableAutoDisplay() {
            return enableAutoDisplay;
        }

        public void setEnableAutoDisplay(boolean enableAutoDisplay) {
            this.enableAutoDisplay = enableAutoDisplay;
        }
    }

}