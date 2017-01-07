package com.stockholm.api.setting.clock;


public class ClockConfigBean {
    private boolean skinAutoChange;
    private boolean openSecondSound;

    public ClockConfigBean(boolean skinAutoChange, boolean openSecondSound) {
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
