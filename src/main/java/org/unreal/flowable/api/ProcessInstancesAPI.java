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
    Paging<ProcessInstances> queryProcessDefinitions(@Body ProcessInstancesQuery processInstancesQuery);

    @GET("runtime/process-instances")
    Paging<ProcessInstances> getProcessDefinitions();

    @GET("runtime/process-instances")
    Paging<ProcessInstances> getProcessDefinitionsByFilter(@QueryMap Map<String, Object> params);

    @GET("runtime/process-instances/{processInstanceId}")
    Paging<ProcessInstances> getProcessDefinitions(@Path("processInstanceId") String processInstanceId);

    @DELETE("runtime/process-instances/{processInstanceId}")
    Void deleteProcessDefinitions(@Path("processInstanceId") String processInstanceId);

    @PUT("runtime/process-instances/{processInstanceId}")
    ProcessInstances changeProcessDefinitionsState(@Path("processInstanceId") String processInstanceId,
                                                   @Body Map<String, String> request);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByProcessDefinitionId(@Body ProcessInstanceStartByDefinitionIdQuery startByDefinitionId);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByProcessDefinitionKey(@Body ProcessInstanceStartByDefinitionKeyQuery startByDefinitionKey);

    @POST("runtime/process-instances")
    ProcessInstances startProcessByProcessDefinitionId(@Body ProcessInstanceStartByMessageQuery startByMessage);

    @GET("runtime/process-instances/{processInstanceId}/diagram")
    InputStream getProcessInstanceDiagram(@Path("processInstanceId") String processInstanceId);

}
