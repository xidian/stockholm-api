package com.stockholm.api.album;

import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface AlbumService {

    @GET("/app/album")
    Observable<Response<BaseResponse<AlbumConfigBean>>> queryConfig();

    @PUT("/app/album")
    Observable<Response<BaseResponse<AlbumConfigBean>>> updateConfig(@Body UpdateAlbumConfigReq req);

    @POST("/app/album/uptokens")
    Observable<Response<BaseResponse<List<AlbumTokenBean>>>> getQiniuToken(@Body AlbumTokenReq albumTokenReq);

    @GET("/app/album/photos")
    Observable<Response<BaseResponse<DevicePathBean>>> getImagePath();

    @GET("/app/album/photos/paginate")
    Observable<Response<MobilePathResp>> getImagePathByPage(@Query("currentPhoto") String currentPhoto);

    @DELETE("/app/album/photos/{id}")
    Observable<Response<BaseResponse>> deleteImage(@Path("id") String imageId);

    @GET("/app/album/photos/{id}")
    Observable<Response<BaseResponse<String>>> getLargeImage(@Path("id") String imageId);

}