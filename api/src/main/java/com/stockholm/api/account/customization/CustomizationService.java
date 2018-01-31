package com.stockholm.api.account.customization;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface CustomizationService {

    @GET("/v1/account/customization")
    Observable<Response<BaseResponse<CustomizationBean>>> queryCustomization();

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updateCustomization(@Body UpdateCustomizationReq req);

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updateLocation(@Body UpdateLocationReq req);

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updateChild(@Body UpdateChildReq req);

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updatePlateNo(@Body UpdatePlateNoReq req);

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updateSex(@Body UpdateSexReq req);

    @PUT("/v1/account/customization")
    Observable<Response<BaseResponse>> updateAge(@Body UpdateAgeReq req);

}