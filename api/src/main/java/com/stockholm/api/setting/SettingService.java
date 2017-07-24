package com.stockholm.api.setting;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface SettingService {

    @GET("/device/apps_config")
    Observable<DeviceGetConfigResp> deviceGetConfig();

    @POST("/device/apps_config")
    Observable<DeviceAppConfigPagerResp> getDeviceConfigWithPager(@Body DeviceAppConfigPagerReq deviceAppConfigPagerReq);

    @POST("/mobile/clock/app")
    Observable<DeviceAppConfigPagerResp> getAppConfigWithPager(@Body DeviceAppConfigPagerReq deviceAppConfigPagerReq);

}