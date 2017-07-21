package com.stockholm.api.setting.system;

import com.google.gson.Gson;

public class UpdateSystemConfigReq {

    public UpdateSystemConfigReq(ConfigBean config) {
        this.config = config;
    }

    /**
     * config : {"autoBrightness":true}
     */

    private ConfigBean config;

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public static class ConfigBean {

        private int alarmVolume;
        private int mediaVolume;
        private boolean autoBrightness;
        private int brightness;
        private boolean enableNightMode;
        private int nightModeType;
        private String nightModeStartTime;
        private String nightModeEndTime;

        public int getAlarmVolume() {
            return alarmVolume;
        }

        public void setAlarmVolume(int alarmVolume) {
            this.alarmVolume = alarmVolume;
        }

        public int getMediaVolume() {
            return mediaVolume;
        }

        public void setMediaVolume(int mediaVolume) {
            this.mediaVolume = mediaVolume;
        }

        public boolean isAutoBrightness() {
            return autoBrightness;
        }

        public void setAutoBrightness(boolean autoBrightness) {
            this.autoBrightness = autoBrightness;
        }

        public int getBrightness() {
            return brightness;
        }

        public void setBrightness(int brightness) {
            this.brightness = brightness;
        }

        public boolean isEnableNightMode() {
            return enableNightMode;
        }

        public void setEnableNightMode(boolean enableNightMode) {
            this.enableNightMode = enableNightMode;
        }

        public int getNightModeType() {
            return nightModeType;
        }

        public void setNightModeType(int nightModeType) {
            this.nightModeType = nightModeType;
        }

        public String getNightModeStartTime() {
            return nightModeStartTime;
        }

        public void setNightModeStartTime(String nightModeStartTime) {
            this.nightModeStartTime = nightModeStartTime;
        }

        public String getNightModeEndTime() {
            return nightModeEndTime;
        }

        public void setNightModeEndTime(String nightModeEndTime) {
            this.nightModeEndTime = nightModeEndTime;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        public static ConfigBean get(String json) {
            return new Gson().fromJson(json, ConfigBean.class);
        }

    }
}
