package com.stockholm.api.setting.calendar;


public class DeleteEventRep {
    private int eventId;

    public DeleteEventRep(int eventId) {
        setEventId(eventId);
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

}