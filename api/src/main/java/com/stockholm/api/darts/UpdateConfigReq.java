package com.stockholm.api.darts;


import java.util.List;

public class UpdateConfigReq {

    private DartsConfigBean darts;

    public UpdateConfigReq(int record, List<Integer> scores) {
        this.darts = new DartsConfigBean(record, scores);
    }

    public DartsConfigBean getDarts() {
        return darts;
    }

    public void setDarts(DartsConfigBean darts) {
        this.darts = darts;
    }

}