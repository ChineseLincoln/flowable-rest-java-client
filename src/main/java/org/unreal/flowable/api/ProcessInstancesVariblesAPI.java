package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.process.instances.ProcessInstances;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.ProcessInstanceStartByDefinitionIdQuery;
import org.unreal.flowable.request.ProcessInstanceStartByDefinitionKeyQuery;
import org.unreal.flowable.request.ProcessInstanceStartByMessageQuery;
import org.unreal.flowable.request.ProcessInstancesQuery;
import retrofit2.http.*;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ProcessInstancesVariblesAPI {


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
