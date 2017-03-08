package com.stockholm.api.store;


import retrofit2.http.GET;
import retrofit2.http.Header;
import rx.Observable;

public interface AppStoreService {

    @GET("/apps")
    Observable<AppListResp> getAllApps();

    @GET("/apps")
    Observable<AppDetailResp> getAppDetail(@Header("PackageName") String packageName);

}