package com.stockholm.api.setting.news;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface NewsService {

    @GET("/mobile/clock/app")
    Observable<AllChannelResp> getChannelCoonfig(@HeaderMap Map<String, String> headerMap);

    @PUT("/mobile/clock/app")
    Observable<SetChannelResp> setChannelConfig(@HeaderMap Map<String, String> headerMap,
                                                @Body SetChannelReq setChannelReq);

    @POST("device/app")
    Observable<DeviceChannelResp> getDeviceNewsChannel(@HeaderMap Map<String, String> headerMap);
}
