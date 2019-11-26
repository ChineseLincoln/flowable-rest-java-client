package org.unreal.flowable.model.task;

public class Task {

    /**
     * owner : owner
     * execution : http://localhost:8182/runtime/executions/5
     * parentTask : http://localhost:8182/runtime/tasks/9
     * processDefinition : http://localhost:8182/repository/process-definitions/oneTaskProcess%3A1%3A4
     * dueDate : 2013-04-17T10:17:43.902+0000
     * processInstance : http://localhost:8182/runtime/process-instances/5
     * description : Task description
     * priority : 50
     * suspended : false
     * url : http://localhost:8182/runtime/tasks/8
     * delegationState : pending
     * taskDefinitionKey : theTask
     * createTime : 2013-04-17T10:17:43.902+0000
     * name : My task
     * tenantId : null
     * assignee : kermit
     * id : 8
     */
    private String owner;
    private String execution;
    private String parentTask;
    private String processDefinition;
    private String dueDate;
    private String processInstance;
    private String description;
    private int priority;
    private boolean suspended;
    private String url;
    private String delegationState;
    private String taskDefinitionKey;
    private String createTime;
    private String name;
    private String tenantId;
    private String assignee;
    private String id;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public void setParentTask(String parentTask) {
        this.parentTask = parentTask;
    }

    public void setProcessDefinition(String processDefinition) {
        this.processDefinition = processDefinition;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setProcessInstance(String processInstance) {
        this.processInstance = processInstance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDelegationState(String delegationState) {
        this.delegationState = delegationState;
    }

    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public String getExecution() {
        return execution;
    }

    public String getParentTask() {
        return parentTask;
    }

    public String getProcessDefinition() {
        return processDefinition;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getProcessInstance() {
        return processInstance;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public String getUrl() {
        return url;
    }

    public String getDelegationState() {
        return delegationState;
    }

    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getName() {
        return name;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getId() {
        return id;
    }
}
