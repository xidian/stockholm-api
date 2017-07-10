package com.stockholm.api.setting.clock;


public class ClockConfigUpdateReq {
    private ClockUpdateBean clock;

    public ClockConfigUpdateReq() {
    }

    public ClockConfigUpdateReq(boolean skinAutoChange, boolean openSecondSound, long skin) {
        setClock(new ClockUpdateBean(skinAutoChange, openSecondSound, skin));
    }

    public ClockUpdateBean getClock() {
        return clock;
    }

    public void setClock(ClockUpdateBean clock) {
        this.clock = clock;
    }

    public static class ClockUpdateBean {
        private boolean skinAutoChange;
        private boolean openSecondSound;
        private long skin;

        public ClockUpdateBean() {
        }

        public ClockUpdateBean(boolean skinAutoChange, boolean openSecondSound, long skin) {
            this.skinAutoChange = skinAutoChange;
            this.openSecondSound = openSecondSound;
            this.skin = skin;
        }

        public boolean isSkinAutoChange() {
            return skinAutoChange;
        }

        public void setSkinAutoChange(boolean skinAutoChange) {
            this.skinAutoChange = skinAutoChange;
        }

        public boolean isOpenSecondSound() {
            return openSecondSound;
        }

        public void setOpenSecondSound(boolean openSecondSound) {
            this.openSecondSound = openSecondSound;
        }

        public long getSkin() {
            return skin;
        }

        public void setSkin(long skin) {
            this.skin = skin;
        }
    }

}