package org.unreal.flowable.api;

import org.unreal.flowable.request.*;
import org.unreal.flowable.model.comment.Comment;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.history.*;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface HistoryAPI {

    @GET("history/historic-activity-instances")
    Paging<HistoricActivityInstance> getActivityInstances();

    @GET("history/historic-activity-instances")
    Paging<HistoricActivityInstance> getActivityInstances(@QueryMap Map<String, Object> params);

    @GET("history/historic-detail")
    Paging<HistoricActivityInstance> getDetail();

    @GET("history/historic-detail")
    Paging<HistoricActivityInstance> getDetail(@QueryMap Map<String, Object> params);

    @GET("history/historic-detail/{detailId}/data")
    List<String> getDetailData(@Path("detailId") String detailId);

    @GET("history/historic-task-instances/{taskId}/variables/{variableName}/data")
    List<String> getTaskInstanceData(@Path("taskId") String taskId, @Path("variableName") String variableName);

    @GET("history/historic-variable-instances")
    Paging<HistoricVariableInstance> getVariableInstances();

    @GET("history/historic-variable-instances")
    Paging<HistoricVariableInstance> getVariableInstances(@QueryMap Map<String, Object> params);

    @GET("history/historic-variable-instances/{varInstanceId}/data")
    List<HistoricVariableInstance> getVariableInstancesData(@Path("varInstanceId") String varInstanceId);

    @POST("query/historic-activity-instances")
    Paging<HistoricActivityInstance> queryActivityInstances(@Body HistoricActivityInstanceQuery query);

    @POST("query/historic-detail")
    Paging<HistoricDetail> queryDetails(@Body HistoricDetailQuery query);

    @POST("query/historic-variable-instances")
    Paging<HistoricVariableInstance> queryVariableInstances(@Body HistoricVariableInstanceQuery query);

    @GET("history/historic-process-instances")
    Paging<HistoricProcessInstance> getProcessInstances();

    @GET("history/historic-process-instances")
    Paging<HistoricProcessInstance> getProcessInstances(@QueryMap Map<String, Object> params);

    @DELETE("history/historic-process-instances")
    Void deleteProcessInstances();

    @GET("history/historic-process-instances/{processInstanceId}")
    HistoricProcessInstance getProcessInstance(@Path("processInstanceId") String processInstanceId);

    @DELETE("history/historic-process-instances/{processInstanceId}")
    Void deleteProcessInstance(@Path("processInstanceId") String processInstanceId);

    @GET("history/historic-process-instances/{processInstanceId}/comments")
    List<Comment> getProcessInstanceComments(@Path("processInstanceId") String processInstanceId);

    @POST("history/historic-process-instances/{processInstanceId}/comments")
    Comment createProcessInstanceComment(@Path("processInstanceId") String processInstanceId, @Body Comment comment);

    @DELETE("history/historic-process-instances/{processInstanceId}/comments/{commentId}")
    Void deleteProcessInstanceComment(@Path("processInstanceId") String processInstanceId, @Path("commentId") String commentId);

    @GET("history/historic-process-instances/{processInstanceId}/comments/{commentId}")
    List<Comment> getProcessInstanceComment(@Path("processInstanceId") String processInstanceId, @Path("commentId") String commentId);

    @GET("history/historic-process-instances/{processInstanceId}/identitylinks")
    List<HistoricIdentityLink> getProcessInstanceIdentitylinks(@Path("processInstanceId") String processInstanceId);

    @GET("history/historic-process-instances/{processInstanceId}/variables/{variableName}/data")
    List<String> getProcessInstanceData(@Path("processInstanceId") String processInstanceId, @Path("variableName") String variableName);

    @POST("query/historic-process-instances")
    Paging<HistoricProcessInstance> queryProcessInstance(@Body HistoricProcessInstanceQuery query);

    @GET("history/historic-task-instances")
    Paging<HistoricTaskInstance> getTaskInstances();

    @GET("history/historic-task-instances")
    Paging<HistoricTaskInstance> getTaskInstances(@QueryMap Map<String, Object> params);

    @DELETE("history/historic-task-instances/{taskId}")
    Void deleteTaskInstance(@Path("taskId") String taskId);

    @GET("history/historic-task-instances/{taskId}")
    HistoricTaskInstance getTaskInstance(@Path("taskId") String taskId);

    @GET("/history/historic-task-instances/{taskId}/identitylinks")
    List<HistoricIdentityLink> getTaskInstanceIdentityLinks(@Path("taskId") String taskId);

    @POST("query/historic-task-instances")
    Paging<HistoricTaskInstance> queryTaskInstances(@Body HistoricTaskInstanceQuery query);
}
