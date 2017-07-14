package com.stockholm.api.bind;


public class UpdateGuideStateReq {
    private DeviceBean device;

    public UpdateGuideStateReq(boolean guide) {
        this.device = new DeviceBean(guide);
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public static class DeviceBean {
        private boolean guide;

        public DeviceBean(boolean guide) {
            this.guide = guide;
        }

        public boolean isGuide() {
            return guide;
        }

        public void setGuide(boolean guide) {
            this.guide = guide;
        }
    }

}
