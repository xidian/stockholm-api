package com.stockholm.api.push;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface PushService {

    @POST("/v1/push")
    Observable<Response<BaseResponse>> sendPush(@Body CommonPushReq req);

    @PUT("/v1/push")
    Observable<Response<BaseResponse>> sendReport(@Body PushReportReq req);

}