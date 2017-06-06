package com.stockholm.api.task;


public class MeowTaskReq {

    private AlarmAppsConfig appsConfig;
    private MeowTaskListBeanReq taskConfig;

    public AlarmAppsConfig getAppsConfig() {
        return appsConfig;
    }

    public void setAppsConfig(AlarmAppsConfig appsConfig) {
        this.appsConfig = appsConfig;
    }

    public MeowTaskListBeanReq getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(MeowTaskListBeanReq taskConfig) {
        this.taskConfig = taskConfig;
    }
}
