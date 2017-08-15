package com.stockholm.api.log;


public class LogStatusReq {

    /**
     * log : {"status":1}
     */

    private LogBean log;

    public LogBean getLog() {
        return log;
    }

    public void setLog(LogBean log) {
        this.log = log;
    }

    public static class LogBean {

        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
