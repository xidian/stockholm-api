package com.stockholm.api.setting.album;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface AlbumService {

    @POST("/mobile/apps_configs/album_images")
    Observable<AlbumTokenResp> getQiniuToken(@HeaderMap Map<String, String> headerMap,
                                             @Body AlbumTokenReq albumTokenReq);

    @GET("device/apps_configs/album_images")
    Observable<AlbumPathResp> getImagePath(@HeaderMap Map<String, String> headerMap);


    @GET("/mobile/apps_configs/album_images")
    Observable<AlbumUserPathresp> getUserImagePath(@HeaderMap Map<String, String> headerMap);

    @POST("/mobile/apps_configs/album_images/delete")
    Observable<AlbumUserDeleteResp> deleteUserImagePath(@HeaderMap Map<String, String> headerMap,
                                                     @Body AlbumUserDeleteReq albumUserDeleteReq);

}
