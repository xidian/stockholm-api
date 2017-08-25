package com.stockholm.api.push;


public class PushReportReq {
    private String report;

    public PushReportReq(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

}