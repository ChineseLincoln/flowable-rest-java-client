package org.unreal.flowable.model.execution;

import org.unreal.flowable.model.variables.Variables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class SignalEvent {

    private String action;
    private String signalName;
    private String messageName;
    private List<Variables> variables = new ArrayList<>();
    private List<Variables> transientVariables = new ArrayList<>();


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSignalName() {
        return signalName;
    }

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }

    public List<Variables> getTransientVariables() {
        return transientVariables;
    }

    public void setTransientVariables(List<Variables> transientVariables) {
        this.transientVariables = transientVariables;
    }
}
