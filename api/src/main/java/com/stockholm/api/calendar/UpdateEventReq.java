package com.stockholm.api.calendar;


public class UpdateEventReq {

    private EventBean event;

    public UpdateEventReq(EventBean event) {
        setEvent(event);
    }

    public EventBean getEvent() {
        return event;
    }

    public void setEvent(EventBean event) {
        this.event = event;
    }

}