package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.comment.Comment;
import org.unreal.flowable.model.task.TaskEvent;
import org.unreal.flowable.request.CommentQuery;
import retrofit2.http.*;

import java.util.List;

public interface TaskEventAPI {

    @GET("runtime/tasks/{taskId}/events")
    List<TaskEvent> getEventByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/events/{eventId}")
    List<TaskEvent> getEventByEventId(@Path("taskId") String taskId,
                                      @Path("eventId") String eventId);
}
