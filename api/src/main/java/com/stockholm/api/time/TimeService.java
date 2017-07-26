package com.stockholm.api.time;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.GET;
import rx.Observable;

public interface TimeService {

    @GET("/v1/device/time")
    Observable<Response<BaseResponse<TimeDataBean>>> syncTime();
}
