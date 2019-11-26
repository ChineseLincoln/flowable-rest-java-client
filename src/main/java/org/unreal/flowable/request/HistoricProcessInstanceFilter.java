package org.unreal.flowable.request;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricProcessInstanceFilter {

    private String processInstanceId;
    private String processBusinessKey;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String superProcessInstanceId;
    private boolean excludeSubprocesses;
    private boolean finished;
    private String involvedUser;
    private Date finishedAfter;
    private Date finishedBefore;
    private Date startedAfter;
    private Date startedBefore;
    private String startedBy;
    private boolean includeProcessVariables;
    private String tenantId;
    private String tenantIdLike;
    private Boolean withoutTenantId;

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

    public String getSuperProcessInstanceId() {
        return superProcessInstanceId;
    }

    public void setSuperProcessInstanceId(String superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
    }

    public boolean isExcludeSubprocesses() {
        return excludeSubprocesses;
    }

    public void setExcludeSubprocesses(boolean excludeSubprocesses) {
        this.excludeSubprocesses = excludeSubprocesses;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getInvolvedUser() {
        return involvedUser;
    }

    public void setInvolvedUser(String involvedUser) {
        this.involvedUser = involvedUser;
    }

    public Date getFinishedAfter() {
        return finishedAfter;
    }

    public void setFinishedAfter(Date finishedAfter) {
        this.finishedAfter = finishedAfter;
    }

    public Date getFinishedBefore() {
        return finishedBefore;
    }

    public void setFinishedBefore(Date finishedBefore) {
        this.finishedBefore = finishedBefore;
    }

    public Date getStartedAfter() {
        return startedAfter;
    }

    public void setStartedAfter(Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    public Date getStartedBefore() {
        return startedBefore;
    }

    public void setStartedBefore(Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    public String getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    public boolean isIncludeProcessVariables() {
        return includeProcessVariables;
    }

    public void setIncludeProcessVariables(boolean includeProcessVariables) {
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
}
