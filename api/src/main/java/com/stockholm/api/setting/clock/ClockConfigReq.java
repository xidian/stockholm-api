package com.stockholm.api.setting.clock;


public class ClockConfigReq {

    private String uuid;
    private DeviceConfigBean deviceConfig;

    public ClockConfigReq(String uuid, boolean skinAutoChange, boolean openSecondSound) {
        setUuid(uuid);
        setDeviceConfig(new DeviceConfigBean(skinAutoChange, openSecondSound));
    }

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

        private boolean skinAutoChange;
        private boolean openSecondSound;

        public DeviceConfigBean(boolean skinAutoChange, boolean openSecondSound) {
            setSkinAutoChange(skinAutoChange);
            setOpenSecondSound(openSecondSound);
        }

        public boolean isOpenSecondSound() {
            return openSecondSound;
        }

        public void setOpenSecondSound(boolean openSecondSound) {
            this.openSecondSound = openSecondSound;
        }

        public boolean isSkinAutoChange() {
            return skinAutoChange;
        }

        public void setSkinAutoChange(boolean skinAutoChange) {
            this.skinAutoChange = skinAutoChange;
        }
    }
}
