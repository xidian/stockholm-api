package com.stockholm.api.setting.clock;


import com.stockholm.api.NoBodyResp;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface ClockService {

    @GET("/app/clock")
    Observable<Response<ClockConfigBean>> queryConfig();

    @PUT("/app/clock")
    Observable<Response<NoBodyResp>> updateConfig(@Body ClockConfigUpdateReq req);

    @GET("/app/clock/alarms")
    Observable<Response<List<AlarmBean>>> queryAlarms();

    @GET("/app/clock/skins")
    Observable<Response<List<ClockThemeBean>>> queryThemes();

    @POST("/app/clock/alarms")
    Observable<Response<AddAlarmResp>> addAlarm(@Body AddAlarmReq addAlarmReq);

    @PUT("/app/clock/alarms/{alarmId}")
    Observable<Response<UpdateAlarmResp>> updateAlarm(@Path("alarmId") String alarmId, @Body UpdateAlarmReq updateAlarmReq);

    @DELETE("/app/clock/alarms/{alarmId}")
    Observable<Response<NoBodyResp>> deleteAlarm(@Path("alarmId") String alarmId);

    @PUT("/app/clock/alarms/alarmId/switch")
    Observable<Response<NoBodyResp>> switchAlarm(@Body SwitchAlarmReq switchAlarmReq);
}