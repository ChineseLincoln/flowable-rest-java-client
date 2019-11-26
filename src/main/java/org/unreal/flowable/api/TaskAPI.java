package org.unreal.flowable.api;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.identitylinks.GroupIdentitylinks;
import org.unreal.flowable.model.identitylinks.Identitylinks;
import org.unreal.flowable.model.identitylinks.UserIdentitylinks;
import org.unreal.flowable.model.task.Task;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.ActionTaskQuery;
import org.unreal.flowable.request.TaskQuery;
import org.unreal.flowable.request.UpdateTaskQuery;
import retrofit2.http.*;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface TaskAPI {

    @GET("runtime/tasks/{taskId}")
    Task getTaskById(@Path("taskId") String taskId);

    @GET("runtime/tasks")
    Paging<Task> getTasks(@QueryMap Map<String, String> request);

    @POST("query/tasks")
    Paging<Task> queryTasks(@Body TaskQuery taskQuery);

    @PUT("runtime/tasks/{taskId}")
    Task updateTask(@Body UpdateTaskQuery updateTaskQuery);

    @POST("runtime/tasks/{taskId}")
    Task taskAction(@Body ActionTaskQuery actionTaskQuery);

    @DELETE("runtime/tasks/{taskId}?cascadeHistory={cascadeHistory}&deleteReason={deleteReason}")
    Void deleteTaskById(@Path("taskId") String taskId,
                        @Path("cascadeHistory") boolean cascadeHistory,
                        @Path("deleteReason") String deleteReason);

}
