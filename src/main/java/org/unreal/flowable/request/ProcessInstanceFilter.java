package org.unreal.flowable.request;

public class ProcessInstanceFilter extends AbstractParamsFilter {

    private String id;

    private String processDefinitionKey;

    private String processDefinitionId;

    private String businessKey;

    private String involvedUser;

    private Boolean suspended;

    private String superProcessInstanceId;

    private String subProcessInstanceId;

    private Boolean excludeSubprocesses;

    private Boolean includeProcessVariables;

    private String tenantId;

    private String tenantIdLike;

    private Boolean withoutTenantId;

    private String sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getInvolvedUser() {
        return involvedUser;
    }

    public void setInvolvedUser(String involvedUser) {
        this.involvedUser = involvedUser;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public String getSuperProcessInstanceId() {
        return superProcessInstanceId;
    }

    public void setSuperProcessInstanceId(String superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
    }

    public String getSubProcessInstanceId() {
        return subProcessInstanceId;
    }

    public void setSubProcessInstanceId(String subProcessInstanceId) {
        this.subProcessInstanceId = subProcessInstanceId;
    }

    public Boolean getExcludeSubprocesses() {
        return excludeSubprocesses;
    }

    public void setExcludeSubprocesses(Boolean excludeSubprocesses) {
        this.excludeSubprocesses = excludeSubprocesses;
    }

    public Boolean getIncludeProcessVariables() {
        return includeProcessVariables;
    }

    public void setIncludeProcessVariables(Boolean includeProcessVariables) {
        this.includeProcessVariables = includeProcessVariables;
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

    public Boolean getWithoutTenantId() {
        return withoutTenantId;
    }

    public void setWithoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
