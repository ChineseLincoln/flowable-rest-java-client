package org.unreal.flowable.model.form;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class FormData {

    private String formKey;
    private String deploymentId;
    private String processDefinitionId;
    private String processDefinitionUrl;
    private String taskId;
    private String taskUrl;
    private List<FormProperty> formProperties = new ArrayList<>();
    private List<EnumValue> enumValues = new ArrayList<>();

    public String getFormKey() {
        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessDefinitionUrl() {
        return processDefinitionUrl;
    }

    public void setProcessDefinitionUrl(String processDefinitionUrl) {
        this.processDefinitionUrl = processDefinitionUrl;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    public List<FormProperty> getFormProperties() {
        return formProperties;
    }

    public void setFormProperties(List<FormProperty> formProperties) {
        this.formProperties = formProperties;
    }

    public List<EnumValue> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(List<EnumValue> enumValues) {
        this.enumValues = enumValues;
    }
}
