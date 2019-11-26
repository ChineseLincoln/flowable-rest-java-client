package org.unreal.flowable.request;

public class CommentQuery {

    /**
     * saveProcessInstanceId : true
     * message : This is a comment on the task.
     */
    private boolean saveProcessInstanceId;
    private String message;

    public void setSaveProcessInstanceId(boolean saveProcessInstanceId) {
        this.saveProcessInstanceId = saveProcessInstanceId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSaveProcessInstanceId() {
        return saveProcessInstanceId;
    }

    public String getMessage() {
        return message;
    }
}
