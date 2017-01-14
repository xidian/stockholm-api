package com.stockholm.api.setting;


import com.stockholm.api.setting.clock.alarm.GetClockAlarmResp;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PUT;
import rx.Observable;

public interface SettingService {

    @GET("/clocks")
    Observable<GetBindClocksResp> getBindClocks();

    @GET("/mobile/clock/apps_configs")
    Observable<GetClockAppsResp> getClockApps(@HeaderMap Map<String, String> headerMap);

    @PUT("/mobile/clock/app")
    Observable<AppUpdateConfigResp> appUpdateConfig(@HeaderMap Map<String, String> headerMap,
                                                    @Body AppUpdateConfigReq config);

    @PUT("/device/app")
    Observable<DeviceUpdateConfigResp> deviceUpdateConfig(@HeaderMap Map<String, String> headerMap,
                                                          @Body DeviceUpdateConfigReq config);

    @GET("device/app")
    Observable<DeviceGetConfigResp> deviceGetConfig(@HeaderMap Map<String, String> headerMap);

    @GET("/device/app/get_clock_alarms")
    Observable<GetClockAlarmResp> deviceGetAlarm(@HeaderMap Map<String, String> headerMap);
}