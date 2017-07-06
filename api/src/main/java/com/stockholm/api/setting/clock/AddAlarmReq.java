package com.stockholm.api.setting.clock;

import java.util.List;

public class AddAlarmReq {

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

        private int alarmId;
        private String name;
        private int repeatType;
        private String repeatValue;
        private String ring;
        private boolean status;
        private String taskName;
        private String time;

        public int getAlarmId() {
            return alarmId;
        }

        public void setAlarmId(int alarmId) {
            this.alarmId = alarmId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRepeatType() {
            return repeatType;
        }

        public void setRepeatType(int repeatType) {
            this.repeatType = repeatType;
        }

        public String getRepeatValue() {
            return repeatValue;
        }

        public void setRepeatValue(String repeatValue) {
            this.repeatValue = repeatValue;
        }

        public String getRing() {
            return ring;
        }

        public void setRing(String ring) {
            this.ring = ring;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static class TaskBean {

        private int repeatType;
        private String repeatValue;
        private String startTime;
        private List<String> tasks;

        public int getRepeatType() {
            return repeatType;
        }

        public void setRepeatType(int repeatType) {
            this.repeatType = repeatType;
        }

        public String getRepeatValue() {
            return repeatValue;
        }

        public void setRepeatValue(String repeatValue) {
            this.repeatValue = repeatValue;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public List<String> getTasks() {
            return tasks;
        }

        public void setTasks(List<String> tasks) {
            this.tasks = tasks;
        }
    }
}
