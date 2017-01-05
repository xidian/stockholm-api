package com.stockholm.api.setting.clock;


public class SetClockConfigReq {

    private ConfigBean config;

    public SetClockConfigReq(boolean skinAutoChange, boolean openSecondSound) {
        setConfig(new ConfigBean(skinAutoChange, openSecondSound));
    }

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public static class ConfigBean {

        private boolean skinAutoChange;
        private boolean openSecondSound;

        public ConfigBean(boolean skinAutoChange, boolean openSecondSound) {
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
