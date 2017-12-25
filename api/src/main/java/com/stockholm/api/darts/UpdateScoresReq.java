package com.stockholm.api.darts;


import java.util.List;

public class UpdateScoresReq {

    private UpdateBean darts;

    public UpdateScoresReq(List<Integer> scores) {
        this.darts = new UpdateBean(scores);
    }

    public UpdateBean getDarts() {
        return darts;
    }

    public void setDarts(UpdateBean darts) {
        this.darts = darts;
    }

    public static class UpdateBean {
        private List<Integer> scores;

        public UpdateBean(List<Integer> scores) {
            this.scores = scores;
        }

        public List<Integer> getScores() {
            return scores;
        }

        public void setScores(List<Integer> scores) {
            this.scores = scores;
        }
    }

}