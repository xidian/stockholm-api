package com.stockholm.api.darts;


public class ScoreBean {
    private int index;
    private int score;

    public ScoreBean(int index, int score) {
        this.index = index;
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
