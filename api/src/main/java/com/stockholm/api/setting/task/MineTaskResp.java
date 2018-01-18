package com.stockholm.api.setting.task;

import java.util.List;

public class MineTaskResp {


    /**
     * errorCode : 0
     * data : [{"id":314,"name":"上班","startTime":"11:34","repeatType":1,"repeatValue":"1,2,3,4,5","tasks":[{"taskId":"djkitF","packageName":"com.stockholm.clock"},{"taskId":"ux8cy7","packageName":"com.stockholm.calendar"},{"taskId":"XGRYFf","packageName":"com.stockholm.weather"},{"taskId":"f66qEE","packageName":"com.stockholm.news"},{"taskId":"Tz0XLe","packageName":"com.stockholm.mozik"}],"duration":"110","enableManual":true,"invalidTime":"12:04","open":false},{"id":315,"name":"午饭","startTime":"12:30","repeatType":0,"repeatValue":"","tasks":[{"taskId":"djkitF","packageName":"com.stockholm.clock"},{"taskId":"XGRYFf","packageName":"com.stockholm.weather"},{"taskId":"f66qEE","packageName":"com.stockholm.news"}],"duration":10,"enableManual":false,"invalidTime":"","open":true}]
     */

    private int errorCode;
    private List<MineTask> data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<MineTask> getData() {
        return data;
    }

    public void setData(List<MineTask> data) {
        this.data = data;
    }

}
