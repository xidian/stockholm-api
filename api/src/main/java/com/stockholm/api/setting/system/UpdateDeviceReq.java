package com.stockholm.api.setting.system;

public class UpdateDeviceReq {

    public UpdateDeviceReq(DeviceBean device) {
        this.device = device;
    }

    /**
     * device : {"guide":false,"name":"asdfasdf"}
     */

    private DeviceBean device;

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public static class DeviceBean {

        /**
         * guide : false
         * name : asdfasdf
         */

        private boolean guide;
        private String name;

        public boolean isGuide() {
            return guide;
        }

        public void setGuide(boolean guide) {
            this.guide = guide;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
