package com.stockholm.api.setting.clock;


import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import rx.Observable;

public interface ClockConfigService {
    @GET("/mobile/apps_configs/skins")
    Observable<GetClockSkinsResp> getClockSkins(@HeaderMap Map<String, String> headerMap);
}
