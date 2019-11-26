package org.unreal.flowable.model.process.definitions;

public class ChangeState {

    /**
     * date : 2013-04-15T00:42:12Z
     * action : suspend
     * includeProcessInstances : false
     */
    private String date;
    private String action;
    private String includeProcessInstances;

    public void setDate(String date) {
        this.date = date;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setIncludeProcessInstances(String includeProcessInstances) {
        this.includeProcessInstances = includeProcessInstances;
    }

    public String getDate() {
        return date;
    }

    public String getAction() {
        return action;
    }

    public String getIncludeProcessInstances() {
        return includeProcessInstances;
    }
}
