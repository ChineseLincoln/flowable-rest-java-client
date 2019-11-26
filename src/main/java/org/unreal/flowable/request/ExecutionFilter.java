package org.unreal.flowable.request;


/**
 * Created by Administrator on 2018/3/22.
 */
public class ExecutionFilter extends PagingFilter {
    private String id;
    private String activityId;
    private String parentId;
    private String processInstanceId;
    private String processBusinessKey;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String signalEventSubscriptionName;
    private String messageEventSubscriptionName;
    private String tenantId;
    private String tenantIdLike;
    private String withoutTenantId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessBusinessKey() {
        return processBusinessKey;
    }

    public void setProcessBusinessKey(String processBusinessKey) {
        this.processBusinessKey = processBusinessKey;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getSignalEventSubscriptionName() {
        return signalEventSubscriptionName;
    }

    public void setSignalEventSubscriptionName(String signalEventSubscriptionName) {
        this.signalEventSubscriptionName = signalEventSubscriptionName;
    }

    public String getMessageEventSubscriptionName() {
        return messageEventSubscriptionName;
    }

    public void setMessageEventSubscriptionName(String messageEventSubscriptionName) {
        this.messageEventSubscriptionName = messageEventSubscriptionName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantIdLike() {
        return tenantIdLike;
    }

    public void setTenantIdLike(String tenantIdLike) {
        this.tenantIdLike = tenantIdLike;
    }

    public String getWithoutTenantId() {
        return withoutTenantId;
    }

    public void setWithoutTenantId(String withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }
}
