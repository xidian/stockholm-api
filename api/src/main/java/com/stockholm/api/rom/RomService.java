package com.stockholm.api.rom;

import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import rx.Observable;

public interface RomService {

    @PUT("/v1/device/rom")
    Observable<Response<BaseResponse>> updateVersion(@Body VersionReq req);
}
