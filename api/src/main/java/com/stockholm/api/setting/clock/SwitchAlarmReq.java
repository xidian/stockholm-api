package com.stockholm.api.setting.clock;

public class SwitchAlarmReq {

    /**
     * alarm : {"status":true}
     */

    private AlarmBean alarm;

    public AlarmBean getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmBean alarm) {
        this.alarm = alarm;
    }

    public static class AlarmBean {
        /**
         * status : true
         */

        private boolean status;

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }
}
