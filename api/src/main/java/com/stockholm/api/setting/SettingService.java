package com.stockholm.api.setting;


import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import rx.Observable;

public interface SettingService {

    @GET("/clocks")
    Observable<GetBindClocksResp> getBindClocks();

    @GET("/mobile/clock/apps")
    Observable<GetClockAppsResp> getClockApps(@HeaderMap Map<String, String> headerMap);
}