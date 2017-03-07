package com.stockholm.api.setting.fm;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.PUT;
import rx.Observable;

public interface FmPlayControlService {

    @PUT("/mobile/apps_configs/fm_play")
    Observable<FmPlayControlResp> controlPlay(@HeaderMap Map<String, String> headerMap,
                                              @Body FmPlayControlReq fmPlayControlReq);

    @PUT("/device/apps_configs/fm_play")
    Observable<FmPlayControlResp> deviceControlPlay(@HeaderMap Map<String, String> headerMap,
                                                    @Body FmPlayControlReq fmPlayControlReq);

}