package com.stockholm.api.bind;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

public interface BindService {

    @POST("/v1/device/binding")
    Observable<Response<BaseResponse<DeviceBindStateBean>>> bind(@Header("Access-Token") String accessToken, @Body BindReq bindReq);

    @DELETE("/v1/device/binding")
    Observable<Response<BaseResponse>> unbind();

    @GET("/v1/device/binding")
    Observable<Response<BaseResponse<DeviceBindStateBean>>> checkDeviceBindState();

    @PUT("/v1/device")
    Observable<Response<BaseResponse>> updateUserGuideState(@Body UpdateGuideStateReq req);

    @POST("/v1/device")
    Observable<Response<BaseResponse<DeviceBindStateBean>>> registerDevice(@Body RegisterDeviceReq req);

    @PUT("/v1/device")
    Observable<Response<BaseResponse>> updatePushToken(@Body UpdatePushTokenReq req);

    @GET("/v1/device")
    Observable<Response<BaseResponse>> skipUserGuide();

    @GET("/v1/device/user/new")
    Observable<Response<BaseResponse<ShareUserInfoBean>>> getShareUserInfo(@Query("user[phoneNumber]") String phoneNumber);

    @POST("/v1/device/user")
    Observable<Response<BaseResponse>> addShareUser(@Body AddShareReq addShareReq);

}