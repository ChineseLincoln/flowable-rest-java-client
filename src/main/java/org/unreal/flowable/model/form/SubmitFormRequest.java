package org.unreal.flowable.model.form;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class SubmitFormRequest {

    private String action;
    private String processDefinitionId;
    private String taskId;
    private String businessKey;
    private List<FormProperty> properties = new ArrayList<>();
    private List<EnumValue> enumValues = new ArrayList<>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public List<FormProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<FormProperty> properties) {
        this.properties = properties;
    }

    public List<EnumValue> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(List<EnumValue> enumValues) {
        this.enumValues = enumValues;
    }
}
