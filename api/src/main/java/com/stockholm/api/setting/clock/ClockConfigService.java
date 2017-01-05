package com.stockholm.api.setting.clock;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface ClockConfigService {
    @PUT("/mobile/clocks/apps/{app_id}")
    Observable<SetClockConfigResp> setClcokClock(@Path("app_id") String appId,
                                                 @HeaderMap Map<String, String> headerMap,
                                                 @Body SetClockConfigReq body);

    @POST("device/apps/{app_id}")
    Observable<DeviceClockConfigResp> getClockConfig(@Path("app_id") String appId,
                                                     @Body DeviceClockConfigReq body);
}
