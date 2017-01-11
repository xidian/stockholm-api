package com.stockholm.api.setting.clock.alarm;


public class ClockAlarmReq {
    private GetClockAlarmResp.AlarmBean clockAlarm;

    public ClockAlarmReq(GetClockAlarmResp.AlarmBean clockAlarm) {
        setClockAlarm(clockAlarm);
    }

    public GetClockAlarmResp.AlarmBean getClockAlarm() {
        return clockAlarm;
    }

    public void setClockAlarm(GetClockAlarmResp.AlarmBean clockAlarm) {
        this.clockAlarm = clockAlarm;
    }
}
