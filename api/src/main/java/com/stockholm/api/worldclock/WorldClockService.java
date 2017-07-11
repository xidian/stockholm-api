package com.stockholm.api.worldclock;


import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface WorldClockService {

    @GET("/app/worldclock")
    Observable<Response<ConfigBean>> queryConfig();

    @PUT("/app/worldclock")
    Observable<Response<NoBodyResp>> updateConfig(@Body UpdateConfigReq req);

}