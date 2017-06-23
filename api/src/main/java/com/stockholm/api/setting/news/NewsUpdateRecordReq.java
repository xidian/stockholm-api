package com.stockholm.api.setting.news;


import com.stockholm.api.audio.AudioRecord;

public class NewsUpdateRecordReq {
    private AudioRecord record;

    public NewsUpdateRecordReq(AudioRecord record) {
        this.record = record;
    }

    public AudioRecord getRecord() {
        return record;
    }

    public void setRecord(AudioRecord record) {
        this.record = record;
    }

}