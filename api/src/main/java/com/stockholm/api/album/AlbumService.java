package com.stockholm.api.album;

import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface AlbumService {

    @GET("/app/album")
    Observable<Response<BaseResponse<AlbumConfigBean>>> queryConfig();

    @PUT("/app/album")
    Observable<Response<BaseResponse<AlbumConfigBean>>> updateConfig(@Body UpdateAlbumConfigReq req);

    @POST("")
    Observable<Response<BaseResponse<AlbumTokenBean>>> getQiniuToken(@Body AlbumTokenReq albumTokenReq);

    @GET("")
    Observable<Response<BaseResponse<AlbumImageBean>>> getImagePath();

    @GET("")
    Observable<Response<BaseResponse<AlbumImageBean>>> getImagePathByPage();

    @HTTP(method = "DELETE", path = "", hasBody = true)
    Observable<Response<BaseResponse>> deleteImage(@Body AlbumUserDeleteReq albumUserDeleteReq);

}