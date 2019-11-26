package org.unreal.flowable.request;

import java.util.List;

public class ProcessInstanceStartByDefinitionIdQuery {

    /**
     * processDefinitionId : oneTaskProcess:1:158
     * variables : [{"name":"myVar","value":"This is a variable"}]
     * returnVariables : true
     * businessKey : myBusinessKey
     */
    private String processDefinitionId;
    private List<VariablesQuery> variables;
    private boolean returnVariables = true;
    private String businessKey;

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public void setVariables(List<VariablesQuery> variables) {
        this.variables = variables;
    }

    public void setReturnVariables(boolean returnVariables) {
        this.returnVariables = returnVariables;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
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
}
