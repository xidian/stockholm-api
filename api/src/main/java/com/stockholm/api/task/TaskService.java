package com.stockholm.api.task;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import rx.Observable;

public interface TaskService {

    @PUT("/mobile/clock/app_with_task")
    Observable<MeowTaskResp> modify(@Header("Access-Token") String accessToken,
                                    @Header("UUID") String uuid,
                                    @Header("PackageName") String packageName,
                                    @Body MeowTaskReq req);

    @GET("/app/task_configs")
    Observable<MeowTaskListResp> tasks();
}
