package com.stockholm.api.bind;


import com.stockholm.api.base.BaseDataBean;
import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface BindService {

    @POST("/v1/device/binding")
    Observable<Response<BaseResponse>> bind(@Header("Access-Token") String accessToken, @Body BindReq bindReq);

    @DELETE("/v1/device/binding")
    Observable<Response<BaseResponse>> unbind();

    @GET("/v1/device/binding")
    Observable<Response<DeviceBindStateResp>> checkDeviceBindState();

    @PUT("/v1/device")
    Observable<Response<BaseDataBean>> updateUserGuideState(@Body UpdateGuideStateReq req);

}