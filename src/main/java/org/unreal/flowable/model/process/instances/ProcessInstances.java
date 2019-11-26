package org.unreal.flowable.model.process.instances;

import java.util.List;

public class ProcessInstances {

    /**
     * processDefinitionId : alarm_flow:2:b37a3098-0f24-11ea-bdb8-d0abd5554ec0
     * variables : []
     * startedBy : null
     * started : 2019-11-25T10:50:37.136+08:00
     * completed : false
     * url : http://127.0.0.1:8080/process-api/runtime/process-instances/5bcdfd8e-0f2e-11ea-ae38-d0abd5554ec0
     * suspended : false
     * activityId : null
     * callbackId : null
     * name : null
     * businessKey : alrm_process_id
     * ended : false
     * tenantId :
     * id : 5bcdfd8e-0f2e-11ea-ae38-d0abd5554ec0
     * processDefinitionUrl : http://127.0.0.1:8080/process-api/repository/process-definitions/alarm_flow:2:b37a3098-0f24-11ea-bdb8-d0abd5554ec0
     * callbackType : null
     */
    private String processDefinitionId;
    private List<?> variables;
    private String startedBy;
    private String started;
    private boolean completed;
    private String url;
    private boolean suspended;
    private String activityId;
    private String callbackId;
    private String name;
    private String businessKey;
    private boolean ended;
    private String tenantId;
    private String id;
    private String processDefinitionUrl;
    private String callbackType;

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public void setVariables(List<?> variables) {
        this.variables = variables;
    }

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProcessDefinitionUrl(String processDefinitionUrl) {
        this.processDefinitionUrl = processDefinitionUrl;
    }

    public void setCallbackType(String callbackType) {
        this.callbackType = callbackType;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public List<?> getVariables() {
        return variables;
    }

    public String getStartedBy() {
        return startedBy;
    }

    public String getStarted() {
        return started;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getUrl() {
        return url;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public String getActivityId() {
        return activityId;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public String getName() {
        return name;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public boolean isEnded() {
        return ended;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getId() {
        return id;
    }

    public String getProcessDefinitionUrl() {
        return processDefinitionUrl;
    }

    public String getCallbackType() {
        return callbackType;
    }
}
