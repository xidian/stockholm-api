package com.stockholm.api.setting.clock;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ClockConfigBean {
    private boolean skinAutoChange;
    private boolean openSecondSound;
    private GetClockSkinsResp.ClockThemeBean clockSkin;
    private List<AlarmBean> alarmList = new ArrayList<>();

    public ClockConfigBean(boolean skinAutoChange, boolean openSecondSound,
                           GetClockSkinsResp.ClockThemeBean clockSkin, List<AlarmBean> alarmList) {
        setSkinAutoChange(skinAutoChange);
        setOpenSecondSound(openSecondSound);
        setClockSkin(clockSkin);
        setAlarmList(alarmList);
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

    public List<AlarmBean> getAlarmList() {
        return alarmList;
    }

    public void setAlarmList(List<AlarmBean> alarmList) {
        this.alarmList = alarmList;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static ClockConfigBean get(String json) {
        return new Gson().fromJson(json, ClockConfigBean.class);
    }

}