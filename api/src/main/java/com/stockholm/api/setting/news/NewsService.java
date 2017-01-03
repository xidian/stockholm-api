package com.stockholm.api.setting.news;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface NewsService {

    @GET("/mobile/clocks/apps/{appid}")
    Observable<AllChannelResp> getMobileNewsChannel(@HeaderMap Map<String, String> headerMap,
                                                    @Path("appid") String appid);

    @PUT("/mobile/clocks/apps/{appid}")
    Observable<SetChannelResp> setMobileNewsChannel(@HeaderMap Map<String, String> headerMap,
                                                    @Path("appid") String appid,
                                                    @Body SetChannelReq setChannelReq);

    @GET("/device/apps/{appid}")
    Observable<DeviceChannelResp> getDeviceNewsChannel(@Path("appid") String appid,
                                                    @Body DeviceChannelReq deviceChannelReq);
}
