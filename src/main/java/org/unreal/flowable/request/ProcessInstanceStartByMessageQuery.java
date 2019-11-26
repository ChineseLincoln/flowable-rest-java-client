package org.unreal.flowable.request;

import java.util.List;

public class ProcessInstanceStartByMessageQuery {


    /**
     * variables : [{"name":"myVar","value":"This is a variable"}]
     * businessKey : myBusinessKey
     * tenantId : tenant1
     * message : newOrderMessage
     */
    private List<VariablesQuery> variables;
    private String businessKey;
    private String tenantId;
    private String message;

    public void setVariables(List<VariablesQuery> variables) {
        this.variables = variables;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VariablesQuery> getVariables() {
        return variables;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getMessage() {
        return message;
    }
}
