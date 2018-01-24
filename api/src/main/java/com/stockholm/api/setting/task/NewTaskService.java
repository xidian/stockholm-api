package com.stockholm.api.setting.task;

import com.stockholm.api.NoBodyResp;
import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface NewTaskService {

    @GET("/v1/auto-tasks")
    Observable<Response<MineTaskResp>> listMineTask();

    @POST("/v1/auto-tasks")
    Observable<Response<BaseResponse>> createTask(@Body CreateReq createReq);

    @PUT("/v1/auto-tasks/{autoTaskId}")
    Observable<Response<BaseResponse>> updateTask(@Path("autoTaskId") String taskId, @Body CreateReq createReq);

    @DELETE("/v1/auto-tasks/{autoTaskId}")
    Observable<Response<NoBodyResp>> deleteTask(@Path("autoTaskId") String taskId);
}
