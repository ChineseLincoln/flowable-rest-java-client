package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class ModelFilter extends AbstractParamsFilter{

    private String name;
    private String key;
    private String category;
    private Integer version;
    private String metaInfo;
    private String deploymentId;
    private String tenantId;

    private boolean nameChanged;
    private boolean keyChanged;
    private boolean categoryChanged;
    private boolean versionChanged;
    private boolean metaInfoChanged;
    private boolean deploymentChanged;
    private boolean tenantChanged;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public boolean isNameChanged() {
        return nameChanged;
    }

    public void setNameChanged(boolean nameChanged) {
        this.nameChanged = nameChanged;
    }

    public boolean isKeyChanged() {
        return keyChanged;
    }

    public void setKeyChanged(boolean keyChanged) {
        this.keyChanged = keyChanged;
    }

    public boolean isCategoryChanged() {
        return categoryChanged;
    }

    public void setCategoryChanged(boolean categoryChanged) {
        this.categoryChanged = categoryChanged;
    }

    public boolean isVersionChanged() {
        return versionChanged;
    }

    public void setVersionChanged(boolean versionChanged) {
        this.versionChanged = versionChanged;
    }

    public boolean isMetaInfoChanged() {
        return metaInfoChanged;
    }

    public void setMetaInfoChanged(boolean metaInfoChanged) {
        this.metaInfoChanged = metaInfoChanged;
    }

    public boolean isDeploymentChanged() {
        return deploymentChanged;
    }

    public void setDeploymentChanged(boolean deploymentChanged) {
        this.deploymentChanged = deploymentChanged;
    }

    public boolean isTenantChanged() {
        return tenantChanged;
    }

    public void setTenantChanged(boolean tenantChanged) {
        this.tenantChanged = tenantChanged;
    }
}
