package org.unreal.flowable.request;

import java.util.List;

public class ProcessInstanceStartByDefinitionKeyQuery {

    /**
     * variables : [{"name":"myVar","value":"This is a variable"}]
     * returnVariables : false
     * businessKey : myBusinessKey
     * tenantId : tenant1
     * processDefinitionKey : oneTaskProcess
     */
    private List<VariablesQuery> variables;
    private boolean returnVariables = true;
    private String businessKey;
    private String tenantId;
    private String processDefinitionKey;

    public void setVariables(List<VariablesQuery> variables) {
        this.variables = variables;
    }

    public void setReturnVariables(boolean returnVariables) {
        this.returnVariables = returnVariables;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public List<VariablesQuery> getVariables() {
        return variables;
    }

    public boolean isReturnVariables() {
        return returnVariables;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }
}
