package com.stockholm.api.setting.album;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface AlbumTokenService {

    @POST("/mobile/apps_configs/album_images")
    Observable<AlbumTokenResp> getQiniuToken(@HeaderMap Map<String, String> headerMap,
                                             @Body AlbumTokenReq albumTokenReq);

    @GET("device/apps_configs/album_images")
    Observable<AlbumPathResp> getImagePath(@HeaderMap Map<String, String> headerMap);
}
