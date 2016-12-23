package com.stockholm.api.bind;


import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface BindService {

    @POST("clocks/bind")
    Observable<BindResp> bind(@Body BindReq bindReq);
}
