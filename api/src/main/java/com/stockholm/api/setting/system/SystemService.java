package com.stockholm.api.setting.system;

import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

public interface SystemService {

    @GET("/v1/account/devices")
    Observable<Response<DeviceListResp>> getDeviceList();

    @PUT("/v1/account/devices/switch")
    Observable<Response<BaseResponse>> switchDevice(@Body SwitchDeviceReq req);

    @PUT("/v1/device/apps-config")
    Observable<Response<BaseResponse>> hideApp(@Body HideAppReq req);

    @PUT("/v1/device/apps-config/sort")
    Observable<Response<BaseResponse>> sortApps(@Body SortAppReq req);

    @GET("/v1/home/apps")
    Observable<Response<BaseResponse<List<AppsBean>>>> getInstalledApps();

    @GET("/v1/device/config")
    Observable<Response<BaseResponse<SystemSettingBean>>> getSystemConfig();

    @PUT("/v1/device/config")
    Observable<Response<BaseResponse>> updateSystemConfig(UpdateSystemConfigReq req);

    @DELETE("/v1/device/reset")
    Observable<Response<BaseResponse>> resetDevice();

    @GET("/v1/mobile/android/check")
    Observable<Response<BaseResponse<MobileUpdateBean>>> checkUpdate(@Query("versionCode") int versionCode);

    @PUT("/v1/device")
    Observable<Response<BaseResponse>> renameDevice(RenameDeviceReq req);

    @GET("/v1/device/apps-config")
    Observable<Response<BaseResponse<List<AppStateBean>>>> getAppState();

}