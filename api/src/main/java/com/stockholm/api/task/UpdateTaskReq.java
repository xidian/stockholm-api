package com.stockholm.api.task;

/**
 * Created by linkmax on 17-7-6.
 */

public class UpdateTaskReq {

    /**
     * task : {"open":true}
     */

    private TaskBean task;

    public TaskBean getTask() {
        return task;
    }

    public void setTask(TaskBean task) {
        this.task = task;
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
