package com.stockholm.api.setting.task;

public class CreateReq {


    /**
     * autoTask : {"templateType":4,"name":"吃大餐","startTime":"12:23","repeatType":4,"repeatValue":"1,2,3","tasks":[{"taskId":"djkitF","packageName":"com.stockholm.clock"},{"taskId":"XGRYFf","packageName":"com.stockholm.weather"}],"durationType":5,"durationValue":38,"enableManual":true,"invalidTime":"12:28","open":true}
     */

    private MineTask autoTask;

    public MineTask getAutoTask() {
        return autoTask;
    }

    public void setAutoTask(MineTask autoTask) {
        this.autoTask = autoTask;
    }

}
