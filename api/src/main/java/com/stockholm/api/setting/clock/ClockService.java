package com.stockholm.api.setting.clock;


import com.stockholm.api.CommonResp;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import rx.Observable;

public interface ClockService {

    @GET("/app/clock")
    Observable<ClockConfigResp> mobileQueryConfig(@Header("UUID") String uuid);

    @GET("/app/clock")
    Observable<ClockConfigResp> deviceQueryConfig();

    @PUT("/app/clock")
    Observable<CommonResp> mobileUpdateConfig(@Header("UUID") String uuid, @Body ClockConfigUpdateReq req);

    @PUT("/app/clock")
    Observable<CommonResp> deviceUpdateConfig(@Body ClockConfigUpdateReq req);

    @GET("/app/clock/alarms")
    Observable<AlarmListResp> mobileQueryAlarm(@Header("UUID") String uuid);

    @GET("/app/clock/alarms")
    Observable<AlarmListResp> deviceQueryAlarm();

}