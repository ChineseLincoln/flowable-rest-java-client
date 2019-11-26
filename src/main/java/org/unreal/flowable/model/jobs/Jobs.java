package org.unreal.flowable.model.jobs;

public class Jobs {


    /**
     * processInstanceId : 5
     * processInstanceUrl : http://localhost:8182/runtime/process-instances/5
     * processDefinitionId : timerProcess:1:4
     * executionId : 7
     * retries : 3
     * executionUrl : http://localhost:8182/runtime/executions/7
     * dueDate : 2013-06-04T22:05:05.474+0000
     * tenantId : null
     * id : 8
     * url : http://localhost:8182/management/jobs/8
     * exceptionMessage : null
     * processDefinitionUrl : http://localhost:8182/repository/process-definitions/timerProcess%3A1%3A4
     */
    private String processInstanceId;
    private String processInstanceUrl;
    private String processDefinitionId;
    private String executionId;
    private int retries;
    private String executionUrl;
    private String dueDate;
    private String tenantId;
    private String id;
    private String url;
    private String exceptionMessage;
    private String processDefinitionUrl;

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public void setProcessInstanceUrl(String processInstanceUrl) {
        this.processInstanceUrl = processInstanceUrl;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public void setExecutionUrl(String executionUrl) {
        this.executionUrl = executionUrl;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public void setProcessDefinitionUrl(String processDefinitionUrl) {
        this.processDefinitionUrl = processDefinitionUrl;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public String getProcessInstanceUrl() {
        return processInstanceUrl;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public int getRetries() {
        return retries;
    }

    public String getExecutionUrl() {
        return executionUrl;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public String getProcessDefinitionUrl() {
        return processDefinitionUrl;
    }
}
