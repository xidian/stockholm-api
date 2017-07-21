package com.stockholm.api.store;


import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface AppStoreService {

    @GET("/v1/app-store/apps")
    Observable<Response<BaseResponse<List<AppBean>>>> getAppList();

    @GET("/v1/app-store/banners")
    Observable<Response<BaseResponse<List<BannerBean>>>> getBanners();

    @GET("/v1/app-store/recommendations")
    Observable<Response<BaseResponse<List<AppBean>>>> getRecommendApps(@Query("method") String method);

    @GET("/v1/app-store/apps/{id}")
    Observable<Response<BaseResponse<AppDetailBean>>> getAppDetail(@Path("id") long id);

    @GET("/v1/app-store/apps/{id}/comments")
    Observable<Response<CommentListResp>> getCommentList(@Path("id") long id, @Query("page") int page);

    @POST("/v1/app-store/apps/{id}/comments")
    Observable<Response<BaseResponse>> updateAppComment(@Path("id") long id, @Body AddCommentReq req);

    @GET("/v1/app-store/apps/{id}/comments/new")
    Observable<Response<BaseResponse<AppCommentBean>>> getUserComment(@Path("id") long id);

    @POST("/v1/app-store/installer/install")
    Observable<Response<BaseResponse<MobileInstallDataBean>>> mobileInstallApp(@Body StoreOperateAppReq req);

    @POST("/v1/app-store/installer/uninstall")
    Observable<Response<BaseResponse>> mobileUninstallApp(@Body StoreOperateAppReq req);

    @GET("/v1/app/store/installer/url")
    Observable<Response<BaseResponse<DeviceDownloadBean>>> deviceDownloadApp(@Query("packageName") String packageName);

    @POST("/v1/app-store/installer")
    Observable<Response<BaseResponse>> deviceInstallComplete(@Body DeviceInstallCompleteReq req);

    @DELETE("/v1/app-store/installer")
    Observable<Response<BaseResponse>> deviceUninstallComplete(@Body StoreOperateAppReq req);

    @POST("/v1/app-store/installer/check")
    Observable<Response<BaseResponse<List<CheckUpdateBean>>>> forceUpdate(@Body CheckUpdateReq req);

}