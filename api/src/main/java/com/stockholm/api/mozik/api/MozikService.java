package com.stockholm.api.mozik.api;



import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface MozikService {

    String HEADER = "Authorization:Bearer eWlueGlhbmcyLjAuMA==";
    int TEST_UID = 18756;

    @Headers(HEADER)
    @GET("/v3/musics/type/{type}/random")
    Observable<Response<MusicListResp>> queryRandomByType(@Path("type") int type, @Query("num") int num);

    @Headers(HEADER)
    @GET("/v3/musics/filekey/{fileKey}")
    Observable<Response<SongUrlResp>> querySongUrl(@Path("fileKey") String fileKey);

    @Headers(HEADER)
    @GET("/v3/users/uid/{uid}/like")
    Observable<Response<CollectionListResp>> queryCollectionList(@Path("uid") int uid, @Query("page") int page);

    @Headers(HEADER)
    @POST("/v3/users/uid/{uid}/like/mid/{mid}?uuid=0")
    Observable<Response<UpdateCollectionResp>> collectSong(@Path("uid") int uid, @Path("mid") String songId);

    @Headers(HEADER)
    @DELETE("/v3/users/uid/{uid}/like/mid/{mid}?uuid=0")
    Observable<Response<UpdateCollectionResp>> unCollectSong(@Path("uid") int uid, @Path("mid") String songId);

    @Headers(HEADER)
    @GET("/v3/share/image/type/jummo")
    Observable<Response<WallpaperListResp>> queryWallpaperList();

}