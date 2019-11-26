package org.unreal.flowable.api;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.comment.Comment;
import org.unreal.flowable.model.identitylinks.GroupIdentitylinks;
import org.unreal.flowable.model.identitylinks.Identitylinks;
import org.unreal.flowable.model.identitylinks.UserIdentitylinks;
import org.unreal.flowable.model.task.ExtraAttachment;
import org.unreal.flowable.model.task.Task;
import org.unreal.flowable.model.task.TaskAttachment;
import org.unreal.flowable.model.task.TaskEvent;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.ActionTaskQuery;
import org.unreal.flowable.request.CommentQuery;
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

    @POST("runtime/tasks/{taskId}/attachments")
    TaskAttachment createAttachmentByTaskId(@Path("taskId") String taskId,
                                            @Body ExtraAttachment extraAttachment);

    @GET("runtime/tasks/{taskId}/attachments")
    List<TaskAttachment> getTaskAttachmentByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/attachments/{attachmentId}")
    List<TaskAttachment> getTaskAttachmentByAttachmentId(@Path("taskId") String taskId,
                                                         @Path("attachmentId") String attachmentId);

    @DELETE("runtime/tasks/{taskId}/attachments/{attachmentId}")
    Void deleteTaskAttachmentByAttachmentId(@Path("taskId") String taskId,
                                            @Path("attachmentId") String attachmentId);

    @POST("runtime/tasks/{taskId}/comments")
    Comment createCommentByTaskId(@Path("taskId") String taskId ,
                                  @Body CommentQuery commentQuery);

    @GET("runtime/tasks/{taskId}/comments")
    Paging<Comment> getCommentByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/comments/{commentId}")
    Comment getCommentByCommentId(@Path("taskId") String taskId,
                                  @Path("commentId") String commentId);

    @DELETE("runtime/tasks/{taskId}/comments/{commentId}")
    Void deleteCommentByCommentId(@Path("taskId") String taskId,
                                  @Path("commentId") String commentId);

    @GET("runtime/tasks/{taskId}/events")
    List<TaskEvent> getEventByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/events/{eventId}")
    List<TaskEvent> getEventByEventId(@Path("taskId") String taskId,
                                      @Path("eventId") String eventId);

    @GET("runtime/tasks/{taskId}/identitylinks")
    List<Identitylinks> getIdentitylinksByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/identitylinks/{family}")
    List<Identitylinks> getIdentitylinksByTaskIdFamily(@Path("taskId") String taskId,
                                                       @Path("family") String family);

    @GET("runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}")
    List<Identitylinks> getIdentitylinksByIdentityId(@Path("taskId") String taskId,
                                                     @Path("family") String family,
                                                     @Path("identityId") String identityId,
                                                     @Path("type") String type);

    @POST("runtime/tasks/{taskId}/identitylinks")
    Identitylinks createIdentitylinksByTaskId(@Body UserIdentitylinks userIdentitylinks);

    @POST("runtime/tasks/{taskId}/identitylinks")
    Identitylinks createIdentitylinksByTaskId(@Body GroupIdentitylinks groupIdentitylinks);

    @DELETE("runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}")
    Void deleteIdentitylinksByTaskId(@Path("taskId") String taskId,
                                     @Path("family") String family,
                                     @Path("identityId") String identityId,
                                     @Path("type") String type);

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
