package com.stockholm.api.setting.clock.alarm;


public class DeleteClockAlarmReq {
    private int clockAlarmId;

    public DeleteClockAlarmReq(int clockAlarmId) {
        setClockAlarmId(clockAlarmId);
    }

    public int getClockAlarmId() {
        return clockAlarmId;
    }

    public void setClockAlarmId(int clockAlarmId) {
        this.clockAlarmId = clockAlarmId;
    }
}
