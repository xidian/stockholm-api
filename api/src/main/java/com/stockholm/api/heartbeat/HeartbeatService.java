package com.stockholm.api.heartbeat;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import rx.Observable;

public interface HeartbeatService {

    @POST("/v1/device/heartbeat")
    Observable<Response<BaseResponse>> checkDeviceAlive();

    @DELETE("/v1/device/heartbeat")
    Observable<Response<BaseResponse>> closeDeviceConnection();

}
