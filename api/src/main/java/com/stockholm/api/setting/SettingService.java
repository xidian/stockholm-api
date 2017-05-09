package com.stockholm.api.setting;


import com.stockholm.api.setting.system.GetBindClocksResp;
import com.stockholm.api.setting.system.RenameDeviceReq;
import com.stockholm.api.setting.system.RenameDeviceResp;
import com.stockholm.api.setting.system.SwitchDeviceResp;
import com.stockholm.api.setting.system.UnbindDeviceResp;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface SettingService {

    @GET("/clocks")
    Observable<GetBindClocksResp> getBindClocks();

    @GET("/mobile/clock/apps_configs")
    Observable<GetClockAppsResp> getClockApps(@HeaderMap Map<String, String> headerMap);

    @PUT("/mobile/clock/app")
    Observable<AppUpdateConfigResp> appUpdateConfig(@HeaderMap Map<String, String> headerMap,
                                                    @Body AppUpdateConfigReq config);

    @PUT("/mobile/clock/app")
    Observable<AppUpdateConfigResp> appUpdateConfig(@Body AppUpdateConfigReq config);

    @PUT("/device/apps_config")
    Observable<DeviceUpdateConfigResp> deviceUpdateConfig(@Body DeviceUpdateConfigReq config);

    @GET("/device/apps_config")
    Observable<DeviceGetConfigResp> deviceGetConfig();

    @POST("/device/apps_config")
    Observable<DeviceAppConfigPagerResp> getDeviceConfigWithPager(@Body DeviceAppConfigPagerReq deviceAppConfigPagerReq);

    @POST("/clocks/unbind")
    Observable<UnbindDeviceResp> unbindDevice(@HeaderMap Map<String, String> headerMap);

    @PUT("/clock/name")
    Observable<RenameDeviceResp> renameDevice(@HeaderMap Map<String, String> headerMap,
                                              @Body RenameDeviceReq renameDeviceReq);

    @GET("/mobile/clock/app")
    Observable<DeviceAppConfigResp> getAppConfig(@HeaderMap Map<String, String> headerMap);

    @GET("/mobile/clock/app")
    Observable<DeviceAppConfigResp> getAppConfig();

    @POST("/mobile/clock/app")
    Observable<DeviceAppConfigPagerResp> getAppConfigWithPager(@Body DeviceAppConfigPagerReq deviceAppConfigPagerReq);

    @POST("/clients/check_for_updates")
    Observable<UpdateCheckResp> mobileCheckUpdate(@Body UpdateCheckReq updateCheckReq);

    @PUT("/mobile/apps/hide")
    Observable<UpdateAppStateResp> updateAppState(@HeaderMap Map<String, String> headerMap,
                                                  @Body UpdateAppStateReq req);

    @PUT("/mobile/apps/order_numbers")
    Observable<SortAppListResp> sortAppList(@HeaderMap Map<String, String> headerMap,
                                            @Body SortAppListReq req);

    @GET("/device/apps")
    Observable<DeviceAppStateResp> deviceGetAppState();

    @PUT("/user/devices/switch_current_clock")
    Observable<SwitchDeviceResp> switchDevice(@Header("UUID") String uuid);

}