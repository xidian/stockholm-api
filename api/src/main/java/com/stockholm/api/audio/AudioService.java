package com.stockholm.api.audio;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import rx.Observable;

public interface AudioService {

    @PUT("/app/medium")
    Observable<UpdateContentResp> updateAudioContent(@Body UpdateContentReq updateContentReq);

    @GET("/app/medium")
    Observable<GetContentResp> getAudioContent(@Header("UUID") String uuid);
}
