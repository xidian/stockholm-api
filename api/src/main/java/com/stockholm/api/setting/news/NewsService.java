package com.stockholm.api.setting.news;


import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface NewsService {

    @GET("/mobile/clocks/{clockid}/apps/{appid}")
    Observable<AllChannelResp> getMobileNewsChannel(@Header("Access-Token") String Access_Token,
                                                    @Path("clockid") String clockid, @Path("appid") String appid);

    @PUT("/mobile/clocks/{clockid}/apps/{appid}")
    Observable<SetChannelResp> setMobileNewsChannel(@Header("Access-Token") String Access_Token, SetChannelReq setChannelReq);

}
