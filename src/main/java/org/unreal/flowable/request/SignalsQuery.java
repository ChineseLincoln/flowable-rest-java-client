package org.unreal.flowable.request;

import java.util.List;

public class SignalsQuery {


    /**
     * signalName : My Signal
     * async : true
     * variables : [{"name":"testVar","value":"This is a string"}]
     * tenantId : execute
     */
    private String signalName;
    private boolean async;
    private List<VariablesQuery> variables;
    private String tenantId;

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    public void setVariables(List<VariablesQuery> variables) {
        this.variables = variables;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSignalName() {
        return signalName;
    }

    public boolean isAsync() {
        return async;
    }

    public List<VariablesQuery> getVariables() {
        return variables;
    }

    public String getTenantId() {
        return tenantId;
    }
}
