package com.stockholm.api.setting.clock;


public class ClockConfigBean {
    private boolean skinAutoChange;
    private boolean openSecondSound;
    private GetClockSkinsResp.ClockSkinBean clockSkin;

    public ClockConfigBean(boolean skinAutoChange, boolean openSecondSound,
                           GetClockSkinsResp.ClockSkinBean clockSkin) {
        setSkinAutoChange(skinAutoChange);
        setOpenSecondSound(openSecondSound);
        setClockSkin(clockSkin);
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

    public GetClockSkinsResp.ClockSkinBean getClockSkin() {
        return clockSkin;
    }

    public void setClockSkin(GetClockSkinsResp.ClockSkinBean clockSkin) {
        this.clockSkin = clockSkin;
    }
}
