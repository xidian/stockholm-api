package com.stockholm.api.calendar;


import com.stockholm.api.NoBodyResp;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface CalendarService {

    @GET("app/calendar/events")
    Observable<Response<List<EventBean>>> queryEventList();

    @POST("app/calendar/events")
    Observable<Response<Object>> createEvent(@Body UpdateEventReq req);

    @PUT("app/calendar/events/{eventId}")
    Observable<Response<NoBodyResp>> updateEvent(@Path("eventId") long eventId, @Body UpdateEventReq req);

    @HTTP(method = "DELETE" , path = "/app/calendar/events/{eventId}")
    Observable<Response<NoBodyResp>> deleteEvent(@Path("eventId") long eventId);

}