package com.stockholm.api.task;


public class AlarmAppsConfig {

    private String key;
    private String value;

    // @see Command.ADD Command.DELETE Command.UPDATE
    private int cmd;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
