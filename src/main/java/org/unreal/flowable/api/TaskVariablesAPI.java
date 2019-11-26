package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.task.Task;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.ActionTaskQuery;
import org.unreal.flowable.request.TaskQuery;
import org.unreal.flowable.request.UpdateTaskQuery;
import retrofit2.http.*;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface TaskVariablesAPI {

    @GET("runtime/tasks/{taskId}/variables")
    List<Variables> getVariablesByTaskId(@Path("taskId") String taskId,
                                         @Query("scope") String scope);

    @GET("runtime/tasks/{taskId}/variables/{variableName}")
    Variables getVariablesByTaskId(@Path("taskId") String taskId,
                                   @Path("variableName") String variableName,
                                   @Query("scope") String scope);

    @GET("runtime/tasks/{taskId}/variables/{variableName}/data")
    InputStream getVariablesDataByTaskId(@Path("taskId") String taskId,
                                         @Path("variableName") String variableName,
                                         @Query("scope") String scope);

    @POST("runtime/tasks/{taskId}/variables")
    List<Variables> createVariablesByTaskId(@Path("taskId") String taskId,
                                            @Body List<Variables> variables);

    @PUT("runtime/tasks/{taskId}/variables/{variableName}")
    Variables updateVariablesByTaskIdVariableName(@Path("taskId") String taskId,
                                                  @Path("variableName") String variableName,
                                                  @Body Variables variables);

    @DELETE("runtime/tasks/{taskId}/variables/{variableName}")
    Void deleteVariablesByTaskIdVariableName(@Path("taskId") String taskId,
                                             @Path("variableName") String variableName,
                                             @Query("scope") String scope);

    @DELETE("runtime/tasks/{taskId}/variables")
    Void deleteVariablesByTaskId(@Path("taskId") String taskId);


}
