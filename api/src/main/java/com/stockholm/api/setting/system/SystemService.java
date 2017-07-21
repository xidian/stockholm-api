package com.stockholm.api.setting.system;

import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface SystemService {

    @GET("/v1/account/devices")
    Observable<Response<DeviceListResp>> getDeviceList();

    @PUT("/v1/account/devices/switch")
    Observable<Response<BaseResponse>> switchDevice(@Body SwitchDeviceReq req);

    @PUT("/v1/device/apps-config")
    Observable<Response<BaseResponse>> updateAppConfig(@Body UpdateAppConfigReq req);

    @PUT("/v1/device/apps-config/sort")
    Observable<Response<BaseResponse>> sortApps(@Body SortAppReq req);

    @GET("/v1/home/apps")
    Observable<Response<BaseResponse<List<AppsBean>>>> getApps();

    @GET("/v1/device/config")
    Observable<Response<BaseResponse<SystemSettingBean>>> getSystemConfig();

    @PUT("/v1/device/config")
    Observable<Response<BaseResponse>> updateSystemConfig(UpdateSystemConfigReq req);
}
