package com.stockholm.api.setting.clock;


public class ClockConfigReq {

    private String uuid;
    private DeviceConfigBean deviceConfig;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DeviceConfigBean getDeviceConfig() {
        return deviceConfig;
    }

    public void setDeviceConfig(DeviceConfigBean deviceConfig) {
        this.deviceConfig = deviceConfig;
    }

    public static class DeviceConfigBean {

        private boolean autoChangeSkin;
        private boolean openSecondSound;

        public boolean isAutoChangeSkin() {
            return autoChangeSkin;
        }

        public void setAutoChangeSkin(boolean autoChangeSkin) {
            this.autoChangeSkin = autoChangeSkin;
        }

        public boolean isOpenSecondSound() {
            return openSecondSound;
        }

        public void setOpenSecondSound(boolean openSecondSound) {
            this.openSecondSound = openSecondSound;
        }
    }
}
