package com.stockholm.api.setting.task.config;


public class DefTask {


    /**
     * taskId : djkitF
     * taskName : 铃声
     * packageName : com.stockholm.clock
     * order : 0
     */

    private String taskId;
    private String taskName;
    private String packageName;
    private int order;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
