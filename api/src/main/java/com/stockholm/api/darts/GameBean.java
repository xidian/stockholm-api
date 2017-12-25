package com.stockholm.api.darts;


import com.google.gson.Gson;

public class GameBean {
    private int order;
    private ScoreBean score;

    public GameBean(int order) {
        this.order = order;
    }

    public GameBean(int index, int score) {
        this.order = DartsOrder.SHOT;
        this.score = new ScoreBean(index, score);
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ScoreBean getScore() {
        return score;
    }

    public void setScore(ScoreBean score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static GameBean get(String json) {
        return new Gson().fromJson(json, GameBean.class);
    }

}