package com.stockholm.api.setting.clock;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PUT;
import rx.Observable;

public interface ClockConfigService {
    @PUT("/mobile/clock/app")
    Observable<SetClockConfigResp> setClcokClock(@HeaderMap Map<String, String> headerMap,
                                                 @Body SetClockConfigReq body);

    @GET("device/app")
    Observable<DeviceClockConfigResp> getClockConfig(@HeaderMap Map<String, String> headerMap);
}
