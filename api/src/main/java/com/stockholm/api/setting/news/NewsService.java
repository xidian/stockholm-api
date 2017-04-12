package com.stockholm.api.setting.news;


import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import rx.Observable;

public interface NewsService {

    @GET("device/app")
    Observable<DeviceChannelResp> getDeviceNewsChannel(@HeaderMap Map<String, String> headerMap);
}
