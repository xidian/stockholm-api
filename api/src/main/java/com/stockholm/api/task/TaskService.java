package com.stockholm.api.task;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
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

    @GET("/app/task_config?key=alarmList&identifier=clockAlarmId&value=6286")
    Observable<MobileTasksResp> mobileTasks(@Header("UUID") String uuid,
                                            @Header("PackageName") String packageName,
                                            @Query("key") String key,
                                            @Query("identifier") String identifier,
                                            @Query("value") String value);
}
