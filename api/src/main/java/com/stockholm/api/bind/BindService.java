package com.stockholm.api.bind;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

public interface BindService {

    @POST("clocks/bind")
    Observable<BindResp> bind(@Header("Access-Token") String accessToken, @Header("platform") int platform, @Body BindReq bindReq);

    @POST("/clocks/report_wifi_connection")
    Observable<ReportWifiConnectResp> reportWifiConnect(@Header("Access-Token") String accessToken, @Header("platform") int platform);

    @GET("/clock/bindings")
    Observable<BindResp> isDeviceBind(@Header("platform") int platform);

}
