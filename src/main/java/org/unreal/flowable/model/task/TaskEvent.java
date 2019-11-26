package org.unreal.flowable.model.task;

import java.util.List;

public class TaskEvent {

    /**
     * taskUrl : http://localhost:8182/runtime/tasks/2
     * action : AddUserLink
     * id : 4
     * time : 2013-05-17T11:50:50.000+0000
     * message : ["gonzo","contributor"]
     * userId : null
     * url : http://localhost:8182/runtime/tasks/2/events/4
     */
    private String taskUrl;
    private String action;
    private String id;
    private String time;
    private List<String> message;
    private String userId;
    private String url;

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public String getAction() {
        return action;
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public List<String> getMessage() {
        return message;
    }

    public String getUserId() {
        return userId;
    }

    public String getUrl() {
        return url;
    }
}
