package org.unreal.flowable.api;

import okhttp3.MultipartBody;
import org.unreal.flowable.model.task.ExtraAttachment;
import org.unreal.flowable.model.task.TaskAttachment;
import org.unreal.flowable.model.task.TaskEvent;
import retrofit2.http.*;

import java.util.List;

public interface TaskAttachmentsAPI {

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

}
