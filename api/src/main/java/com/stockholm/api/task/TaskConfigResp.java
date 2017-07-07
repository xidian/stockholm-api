package com.stockholm.api.task;

import java.util.List;

public class TaskConfigResp {


    /**
     * success : true
     * msg : 任务详情
     * data : {"taskConfigId":1,"startTime":"12:12","repeatType":0,"repeatValue":"1,2,3","updatedAt":"2017-06-16T10:39:19.000+08:00","task":[{"taskId":"123","priority":null,"packageName":"com.stockholm.fm"}],"open":true}
     */

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
        /**
         * taskConfigId : 1
         * startTime : 12:12
         * repeatType : 0
         * repeatValue : 1,2,3
         * updatedAt : 2017-06-16T10:39:19.000+08:00
         * task : [{"taskId":"123","priority":null,"packageName":"com.stockholm.fm"}]
         * open : true
         */

        private int taskConfigId;
        private String startTime;
        private int repeatType;
        private String repeatValue;
        private String updatedAt;
        private boolean open;
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

        public String getRepeatValue() {
            return repeatValue;
        }

        public void setRepeatValue(String repeatValue) {
            this.repeatValue = repeatValue;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }

        public List<TaskBean> getTask() {
            return task;
        }

        public void setTask(List<TaskBean> task) {
            this.task = task;
        }

        public static class TaskBean {
            /**
             * taskId : 123
             * priority : null
             * packageName : com.stockholm.fm
             */

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
