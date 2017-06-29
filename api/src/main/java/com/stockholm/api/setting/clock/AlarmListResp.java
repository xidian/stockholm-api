package com.stockholm.api.setting.clock;


import com.stockholm.api.CommonResp;

import java.util.List;

public class AlarmListResp extends CommonResp {
    private List<AlarmBean> data;

    public List<AlarmBean> getData() {
        return data;
    }

    public void setData(List<AlarmBean> data) {
        this.data = data;
    }

}