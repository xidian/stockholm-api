package com.stockholm.api.store;


import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface AppStoreService {

    @GET("/v1/app-store/apps")
    Observable<Response<BaseResponse<List<AppBean>>>> getAppList();

    @GET("/v1/app-store/selected")
    Observable<Response<BaseResponse<StoreSelectedData>>> getSelectedList();

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

    @GET("/v1/app-store/installer/url")
    Observable<Response<BaseResponse<DeviceDownloadBean>>> deviceDownloadApp(@Query("packageName") String packageName,
                                                                             @Query("versionCode") int versionCode);

    @POST("/v1/device/app")
    Observable<Response<BaseResponse>> deviceInstallComplete(@Body DeviceInstallCompleteReq req);

    @HTTP(method = "DELETE" , path = "/v1/device/app", hasBody = true)
    Observable<Response<BaseResponse>> deviceUninstallComplete(@Body StoreOperateAppReq req);

    @GET("/v1/app-store/installer/check")
    Observable<Response<BaseResponse<List<CheckUpdateBean>>>> forceUpdate();



}