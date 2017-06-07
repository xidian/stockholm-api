package com.stockholm.api.task;

import java.util.List;

public class MobileTasksResp {

    private boolean success;
    private String msg;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private int taskConfigId;
        private String startTime;
        private int repeatType;
        private Object repeatValue;
        private String updatedAt;
        private List<TaskBean> task;

        public int getTaskConfigId() {
            return taskConfigId;
        }

        public void setTaskConfigId(int taskConfigId) {
            this.taskConfigId = taskConfigId;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public int getRepeatType() {
            return repeatType;
        }

        public void setRepeatType(int repeatType) {
            this.repeatType = repeatType;
        }

        public Object getRepeatValue() {
            return repeatValue;
        }

        public void setRepeatValue(Object repeatValue) {
            this.repeatValue = repeatValue;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public List<TaskBean> getTask() {
            return task;
        }

        public void setTask(List<TaskBean> task) {
            this.task = task;
        }

        public static class TaskBean {

            private String taskId;
            private int priority;
            private String packageName;

            public String getTaskId() {
                return taskId;
            }

            public void setTaskId(String taskId) {
                this.taskId = taskId;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }

            public String getPackageName() {
                return packageName;
            }

            public void setPackageName(String packageName) {
                this.packageName = packageName;
            }
        }
    }
}
