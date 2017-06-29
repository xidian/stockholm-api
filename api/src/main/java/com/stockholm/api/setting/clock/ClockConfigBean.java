package com.stockholm.api.setting.clock;


import com.google.gson.Gson;

public class ClockConfigBean {
    private boolean skinAutoChange;
    private boolean openSecondSound;
    private GetClockSkinsResp.ClockThemeBean clockSkin;

    public ClockConfigBean(boolean skinAutoChange, boolean openSecondSound,
                           GetClockSkinsResp.ClockThemeBean clockSkin) {
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

    public GetClockSkinsResp.ClockThemeBean getClockSkin() {
        return clockSkin;
    }

    public void setClockSkin(GetClockSkinsResp.ClockThemeBean clockSkin) {
        this.clockSkin = clockSkin;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static ClockConfigBean get(String json) {
        return new Gson().fromJson(json, ClockConfigBean.class);
    }

}