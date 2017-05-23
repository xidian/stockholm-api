package com.stockholm.api.time;


import retrofit2.http.GET;
import rx.Observable;

public interface TimeService {

    @GET("/clocks/time")
    Observable<TimeResp> syncTime();
}
