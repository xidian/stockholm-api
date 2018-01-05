package com.stockholm.api.darts;


import com.google.gson.Gson;

import java.util.List;

public class DartsConfigBean {
    private int record;
    private List<Integer> scores;

    public DartsConfigBean() {
    }

    public DartsConfigBean(int record, List<Integer> scores) {
        this.record = record;
        this.scores = scores;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static DartsConfigBean get(String json) {
        return new Gson().fromJson(json, DartsConfigBean.class);
    }

}