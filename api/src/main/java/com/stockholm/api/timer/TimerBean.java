package com.stockholm.api.timer;

public class TimerBean {

    private int id;
    private String name;
    private int interval;

    public TimerBean(int id, String name, int interval) {
        this.id = id;
        this.name = name;
        this.interval = interval;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

}
