package com.stockholm.api.task;


public class MeowTaskReq {

    private AppsConfig appsConfig;
    private MeowTaskListBeanReq taskConfig;

    public AppsConfig getAppsConfig() {
        return appsConfig;
    }

    public void setAppsConfig(AppsConfig appsConfig) {
        this.appsConfig = appsConfig;
    }

    public MeowTaskListBeanReq getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(MeowTaskListBeanReq taskConfig) {
        this.taskConfig = taskConfig;
    }
}
