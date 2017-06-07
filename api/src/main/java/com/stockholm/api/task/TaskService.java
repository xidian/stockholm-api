package com.stockholm.api.task;


import com.stockholm.api.CommonResp;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

public interface TaskService {

    @PUT("/mobile/clock/app_with_task")
    Observable<MeowTaskResp> modify(@Header("UUID") String uuid,
                                    @Header("PackageName") String packageName,
                                    @Body MeowTaskReq req);

    @GET("/app/task_configs")
    Observable<MeowTaskListResp> tasks();

    @GET("/app/task_config")
    Observable<MobileTasksResp> mobileQueryTasks(@Header("UUID") String uuid,
                                                 @Header("PackageName") String packageName,
                                                 @Query("key") String key,
                                                 @Query("identifier") String identifier,
                                                 @Query("value") String value);

    @POST("/app/task_config/switch")
    Observable<CommonResp> changeTaskStatus(@Header("UUID") String uuid,
                                            @Header("PackageName") String packageName,
                                            @Body ChangeTaskStatusReq changeTaskStatusReq);
}
