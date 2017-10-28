package com.stockholm.api.business;


import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.GET;
import rx.Observable;

public interface BusinessService {

    @GET("images.json")
    Observable<Response<BaseResponse<List<DisplayBean>>>> queryDisplayList();

}