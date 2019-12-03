package org.unreal.flowable.api;

import org.unreal.flowable.model.identitylinks.Identitylinks;
import org.unreal.flowable.model.identitylinks.UserIdentitylinks;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.*;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.process.instances.ProcessInstances;
import retrofit2.http.*;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ProcessInstancesAPI {

    @GET("query/process-instances")
    Paging<ProcessInstances> queryProcessInstance(@Body ProcessInstancesQuery processInstancesQuery);

    @GET("runtime/process-instances")
    Paging<ProcessInstances> getProcessInstance();

    @GET("runtime/process-instances")
    Paging<ProcessInstances> getProcessInstanceByFilter(@QueryMap Map<String, Object> params);

    @GET("runtime/process-instances/{processInstanceId}")
    ProcessInstances getProcessInstance(@Path("processInstanceId") String processInstanceId);

    @DELETE("runtime/process-instances/{processInstanceId}")
    Void deleteProcessInstance(@Path("processInstanceId") String processInstanceId);

    @PUT("runtime/process-instances/{processInstanceId}")
    ProcessInstances changeProcessInstanceState(@Path("processInstanceId") String processInstanceId,
                                                @Body Map<String, String> request);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByProcessDefinitionId(@Body ProcessInstanceStartByDefinitionIdQuery startByDefinitionId);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByProcessDefinitionKey(@Body ProcessInstanceStartByDefinitionKeyQuery startByDefinitionKey);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByMessageId(@Body ProcessInstanceStartByMessageQuery startByMessage);

    @GET("runtime/process-instances/{processInstanceId}/diagram")
    InputStream getProcessInstanceDiagram(@Path("processInstanceId") String processInstanceId);

    @GET("runtime/process-instances/{processInstanceId}/identitylinks")
    List<Identitylinks> getProcessInstanceIdentitylinks(@Path("processInstanceId") String processInstanceId);

    @POST("runtime/process-instances/{processInstanceId}/identitylinks")
    Identitylinks createProcessInstanceUserIdentitylinks(@Path("processInstanceId") String processInstanceId,
                                                         @Body UserIdentitylinks userIdentitylinks);

    @DELETE("runtime/process-instances/{processInstanceId}/identitylinks/users/{user}/{type}")
    Void deleteProcessInstanceUserIdentitylinks(@Path("processInstanceId") String processInstanceId,
                                                @Path("user") String user,
                                                @Path("type") String type);

    @GET("runtime/process-instances/{processInstanceId}/variables")
    List<Variables> getProcessInstanceVariables(@Path("processInstanceId") String processInstanceId);

    @GET("runtime/process-instances/{processInstanceId}/variables/{variableName}")
    Variables getProcessInstanceVariablesByName(@Path("processInstanceId") String processInstanceId,
                                                @Path("variableName") String variableName);

    @POST("runtime/process-instances/{processInstanceId}/variables")
    List<Variables> addProcessInstanceVariables(@Path("processInstanceId") String processInstanceId,
                                                @Body List<Variables> variables);

    @PUT("runtime/process-instances/{processInstanceId}/variables")
    List<Variables> updateProcessInstanceVariables(@Path("processInstanceId") String processInstanceId,
                                                   @Body List<Variables> variables);

    @POST("runtime/process-instances/{processInstanceId}/variables/{variableName}")
    List<Variables> addProcessInstanceVariablesByName(@Path("processInstanceId") String processInstanceId,
                                                      @Path("variableName") String variableName,
                                                      @Body Variables variable);

    @PUT("runtime/process-instances/{processInstanceId}/variables/{variableName}")
    List<Variables> updateProcessInstanceVariablesByName(@Path("processInstanceId") String processInstanceId,
                                                         @Path("variableName") String variableName,
                                                         @Body Variables variable);
}
