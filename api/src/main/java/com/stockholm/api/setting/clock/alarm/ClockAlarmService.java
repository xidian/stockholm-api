package com.stockholm.api.setting.clock.alarm;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface ClockAlarmService {
    @GET("/mobile/apps_configs/clock_alarms")
    Observable<GetClockAlarmResp> getClockAlarm(@HeaderMap Map<String, String> headerMap);

    @POST("/mobile/apps_configs/clock_alarms")
    Observable<AddClockAlarmResp> addClockAlarm(@HeaderMap Map<String, String> headerMap,@Body ClockAlarmReq req);

    @PUT("/mobile/apps_configs/clock_alarm")
    Observable<ClockAlarmResp> updateClockAlarm(@HeaderMap Map<String, String> headerMap,@Body ClockAlarmReq req);

    @POST("/mobile/apps_configs/clock_alarm/delete")
    Observable<ClockAlarmResp> deleteClockAlarm(@HeaderMap Map<String, String> headerMap,@Body DeleteClockAlarmReq req);
}