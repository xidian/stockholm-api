package com.stockholm.api.setting.clock;

public class SwitchAlarmReq {

    private AlarmBean alarm;
    private TaskBean task;

    public AlarmBean getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmBean alarm) {
        this.alarm = alarm;
    }

    public TaskBean getTask() {
        return task;
    }

    public void setTask(TaskBean task) {
        this.task = task;
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

    public static class TaskBean {
        /**
         * open : true
         */

        private boolean open;

        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }
    }
}
