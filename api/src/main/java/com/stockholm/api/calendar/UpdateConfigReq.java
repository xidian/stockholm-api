package com.stockholm.api.calendar;

public class UpdateConfigReq {

    private CalendarBean calendar;

    public UpdateConfigReq(int constellatory) {
        this.calendar = new CalendarBean(constellatory);
    }

    public CalendarBean getCalendar() {
        return calendar;
    }

    public void setCalendar(CalendarBean calendar) {
        this.calendar = calendar;
    }

    public static class CalendarBean {
        private int constellatory;

        public CalendarBean(int constellatory) {
            this.constellatory = constellatory;
        }

        public int getConstellatory() {
            return constellatory;
        }

        public void setConstellatory(int constellatory) {
            this.constellatory = constellatory;
        }
    }

}