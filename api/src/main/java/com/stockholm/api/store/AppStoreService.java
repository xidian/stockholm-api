package com.stockholm.api.store;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface AppStoreService {

    @GET("/apps")
    Observable<AppListResp> getAllApps();

    @GET("/app")
    Observable<AppDetailResp> getAppDetail(@Header("PackageName") String packageName);

    @GET("/mobile/apps/comments")
    Observable<AppCommentResp> getAppComments(@Query("page") String page, @Header("PackageName") String packageName);

    @POST("/mobile/apps/comments")
    Observable<StoreCommonResp> editAppComment(@HeaderMap Map<String, String> headerMap, @Body AddCommentReq req);

    @GET("/mobile/apps/comments/new")
    Observable<GetUserCommentResp> getUserComment(@HeaderMap Map<String, String> headerMap);

    @POST("/mobile/app/install")
    Observable<StoreCommonResp> mobileInstallApp(@HeaderMap Map<String, String> headerMap, @Body MobileInstallAppReq req);

    @GET("/device/app/download")
    Observable<DeviceDownloadAppResp> deviceDownloadApp(@HeaderMap Map<String, String> headerMap);

    @POST("/mobile/push")
    Observable<StoreCommonResp> pushToDevice(@HeaderMap Map<String, String> headerMap, @Body StoreCommonPushReq req);

    @POST("/device/push")
    Observable<StoreCommonResp> pushToMobile(@Header("UUID") String uuid, @Body StoreCommonPushReq req);

}