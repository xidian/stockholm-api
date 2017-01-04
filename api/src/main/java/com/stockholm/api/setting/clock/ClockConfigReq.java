package com.stockholm.api.setting.clock;


public class ClockConfigReq {

    public enum TYPE {
        SKIN,
        SOUND
    }

    private String uuid;
    private DeviceConfigBean deviceConfig;

    public ClockConfigReq(String uuid, TYPE type, boolean isChecked) {
        setUuid(uuid);
        setDeviceConfig(new DeviceConfigBean(type, isChecked));
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

        private TYPE type;
        private boolean isChecked;

        public DeviceConfigBean(TYPE type, boolean isChecked) {
            setType(type);
            setChecked(isChecked);
        }

        public TYPE getType() {
            return type;
        }

        public void setType(TYPE type) {
            this.type = type;
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }
    }
}
