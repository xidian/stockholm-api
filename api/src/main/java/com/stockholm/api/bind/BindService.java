package com.stockholm.api.bind;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

public interface BindService {

    @POST("clocks/bind")
    Observable<BindResp> bind(@Header("Access-Token") String accessToken, @Body BindReq bindReq);

    @POST("/clocks/report_wifi_connection")
    Observable<ReportWifiConnectResp> reportWifiConnect(@Header("Access-Token") String accessToken, @Header("UUID") String uuid);

    @GET("/clock/bindings")
    Observable<BindResp> isDeviceBind(@Header("UUID") String uuid);

}
