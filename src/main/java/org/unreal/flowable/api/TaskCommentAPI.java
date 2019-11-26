package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.comment.Comment;
import org.unreal.flowable.model.task.Task;
import org.unreal.flowable.request.ActionTaskQuery;
import org.unreal.flowable.request.CommentQuery;
import org.unreal.flowable.request.TaskQuery;
import org.unreal.flowable.request.UpdateTaskQuery;
import retrofit2.http.*;

import java.util.Map;

public interface TaskCommentAPI {

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
}
