package com.stockholm.api.setting.calendar;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface CalendarEventService {

    @GET("/mobile/apps_configs/calendar_events")
    Observable<GetAllEventResp> getAllEvent(@HeaderMap Map<String, String> headerMap);

    @POST("/mobile/apps_configs/calendar_events")
    Observable<UpdateEventResp> updateEvent(@HeaderMap Map<String, String> headerMap, @Body UpdateEventReq req);

    @POST("/mobile/apps_configs/calendar_events/delete")
    Observable<CalendarEventResp> deleteEvent(@HeaderMap Map<String, String> headerMap, @Body DeleteEventRep req);

}