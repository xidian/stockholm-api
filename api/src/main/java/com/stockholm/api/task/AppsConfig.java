package com.stockholm.api.task;


import com.stockholm.api.setting.clock.AlarmBean;

public class AppsConfig {

    private String key;
    private AlarmBean value;

    // @see Command.ADD Command.DELETE Command.UPDATE
    private int cmd;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AlarmBean getValue() {
        return value;
    }

    public void setValue(AlarmBean value) {
        this.value = value;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }
}
