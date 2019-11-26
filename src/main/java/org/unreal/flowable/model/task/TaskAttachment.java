package org.unreal.flowable.model.task;

public class TaskAttachment {

    /**
     * processInstanceUrl : null
     * externalUrl : http://flowable.org
     * contentUrl : null
     * taskUrl : http://localhost:8182/runtime/tasks/2
     * name : Simple attachment
     * description : Simple attachment description
     * id : 3
     * type : simpleType
     * url : http://localhost:8182/runtime/tasks/2/attachments/3
     */
    private String processInstanceUrl;
    private String externalUrl;
    private String contentUrl;
    private String taskUrl;
    private String name;
    private String description;
    private String id;
    private String type;
    private String url;

    public void setProcessInstanceUrl(String processInstanceUrl) {
        this.processInstanceUrl = processInstanceUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProcessInstanceUrl() {
        return processInstanceUrl;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
