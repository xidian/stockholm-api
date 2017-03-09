package com.stockholm.api.store;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface AppStoreService {

    @GET("/apps")
    Observable<AppListResp> getAllApps();

    @GET("/apps")
    Observable<AppDetailResp> getAppDetail(@Header("PackageName") String packageName);

    @GET("/mobile/apps/comments")
    Observable<AppCommentResp> getAppComments(@Header("PackageName") String packageName);

    @POST("/mobile/apps/comments")
    Observable<StoreCommonResp> editAppComment(@HeaderMap Map<String, String> headerMap, @Body AddCommentReq req);

}