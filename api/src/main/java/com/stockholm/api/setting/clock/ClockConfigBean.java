package com.stockholm.api.setting.clock;


import com.google.gson.Gson;

public class ClockConfigBean {
    private boolean skinAutoChange;
    private boolean openSecondSound;
    private ClockThemeBean skin;

    public ClockConfigBean(boolean skinAutoChange, boolean openSecondSound,
                           ClockThemeBean clockSkin) {
        setSkinAutoChange(skinAutoChange);
        setOpenSecondSound(openSecondSound);
        setSkin(clockSkin);
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

    public ClockThemeBean getSkin() {
        return skin;
    }

    public void setSkin(ClockThemeBean skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static ClockConfigBean get(String json) {
        return new Gson().fromJson(json, ClockConfigBean.class);
    }

}