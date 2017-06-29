package com.stockholm.api.setting.clock;


import com.stockholm.api.CommonResp;

public class ClockConfigResp extends CommonResp {
    private ClockConfigBean data;

    public ClockConfigBean getData() {
        return data;
    }

    public void setData(ClockConfigBean data) {
        this.data = data;
    }

}