package com.stockholm.api.setting.music;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface MusicService {

    @POST("/mobile/push")
    Observable<CommonControlResp> mobileContorlDevice(@Body MobileControlReq mobileControlReq);

    @POST("/device/apps_config/play")
    Observable<CommonControlResp> deviceContorlMobile(@HeaderMap Map<String, String> headerMap,
                                                      @Body DeviceControlReq deviceControlReq);
}
