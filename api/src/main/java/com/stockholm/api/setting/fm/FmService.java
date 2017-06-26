package com.stockholm.api.setting.fm;

import com.stockholm.api.CommonResp;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface FmService {

    @GET("app/fm/albums")
    Observable<MineAlbumResp> getMineSubscribe(@Query("page") int page, @Query("limit") int limit);

    @POST("app/fm/albums")
    Observable<CommonResp> subscribeAlbum(@Body SubscribeAlbumReq subscribeAlbumReq);

    @DELETE("app/fm/albums/{albumId}")
    Observable<CommonResp> unSubscribeAlbum(@Path("albumId") String albumId);

    @GET("app/fm/albums/{albumId}")
    Observable<SubscribeStateResp> getSubscribeState(@Path("albumId") String albumId);

    @GET("app/fm/track")
    Observable<CurrentTrackResp> getCurrentTrack();

    @PUT("app/fm/albums/{albumId}/track")
    Observable<CommonResp> updateAlbumTrack(@Path("albumId") String albumId,@Body UpdateTrackReq updateTrackReq);

    @GET("app/fm/albums/{albumId}/track")
    Observable<CurrentTrackResp> getAlbumTrack(@Body AlbumTrackResp albumTrackResp);
}
