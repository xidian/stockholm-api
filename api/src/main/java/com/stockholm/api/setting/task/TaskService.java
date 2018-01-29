package com.stockholm.api.setting.task;

import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface TaskService {

    @GET("/v1/auto-tasks")
    Observable<MineTaskResp> listMineTask();

    @POST("/v1/auto-tasks")
    Observable<Response<NoBodyResp>> createTask(@Body MineTask mineTask);

    @PUT("/v1/auto-tasks/{autoTaskId}")
    Observable<Response<NoBodyResp>> updateTask(@Path("autoTaskId") String taskId, @Body MineTask mineTask);

    @DELETE("/v1/auto-tasks/{autoTaskId}")
    Observable<Response<NoBodyResp>> deleteTask(@Path("autoTaskId") String taskId);
}
