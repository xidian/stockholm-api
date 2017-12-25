package com.stockholm.api.darts;


public class UpdateRecordReq {

    private UpdateBean darts;

    public UpdateRecordReq(int record) {
        this.darts = new UpdateBean(record);
    }

    public UpdateBean getDarts() {
        return darts;
    }

    public void setDarts(UpdateBean darts) {
        this.darts = darts;
    }

    public static class UpdateBean {
        private int record;

        public UpdateBean(int record) {
            this.record = record;
        }

        public int getRecord() {
            return record;
        }

        public void setRecord(int record) {
            this.record = record;
        }
    }

}
