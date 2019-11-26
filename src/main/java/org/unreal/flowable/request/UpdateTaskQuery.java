package org.unreal.flowable.request;

public class UpdateTaskQuery {


    /**
     * delegationState : resolved
     * owner : owner
     * parentTaskId : 3
     * dueDate : 2013-04-17T13:06:02.438+02:00
     * name : New task name
     * description : New task description
     * assignee : assignee
     * priority : 20
     */
    private String delegationState;
    private String owner;
    private String parentTaskId;
    private String dueDate;
    private String name;
    private String description;
    private String assignee;
    private int priority;

    public void setDelegationState(String delegationState) {
        this.delegationState = delegationState;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDelegationState() {
        return delegationState;
    }

    public String getOwner() {
        return owner;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public int getPriority() {
        return priority;
    }
}
