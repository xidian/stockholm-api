package com.stockholm.api.setting.calendar;


public class UpdateEventReq {
    private GetAllEventResp.EventBean calendarEvent;

    public UpdateEventReq(GetAllEventResp.EventBean calendarEvent) {
        setCalendarEvent(calendarEvent);
    }

    public GetAllEventResp.EventBean getCalendarEvent() {
        return calendarEvent;
    }

    public void setCalendarEvent(GetAllEventResp.EventBean calendarEvent) {
        this.calendarEvent = calendarEvent;
    }

}