package com.stockholm.api.bind;


import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface BindService {

    @POST("clocks/bind")
    Observable<BindResp> bind(@Header("Access-Token") String accessToken, @Body BindReq bindReq);

    @POST("/clocks/report_wifi_connection")
    Observable<ReportWifiConnectResp> reportWifiConnect(@Header("Access-Token") String accessToken);

    @GET("/clock/bindings")
    Observable<BindResp> isDeviceBind();

    @PUT("/v1/device")
    Observable<Response<NoBodyResp>> updateUserGuideState(@Body UpdateGuideStateReq req);

}