package org.unreal.flowable.model.process.definitions;

public class ProcessDefinitions {


    /**
     * diagramResource : http://localhost:8182/repository/deployments/2/resources/testProcess.png
     * graphicalNotationDefined : true
     * resource : http://localhost:8182/repository/deployments/2/resources/testProcess.xml
     * deploymentUrl : http://localhost:8081/repository/deployments/2
     * description : This is a process for testing purposes
     * version : 1
     * url : http://localhost:8182/repository/process-definitions/oneTaskProcess%3A1%3A4
     * suspended : false
     * deploymentId : 2
     * name : The One Task Process
     * id : oneTaskProcess:1:4
     * category : Examples
     * startFormDefined : false
     * key : oneTaskProcess
     */
    private String diagramResource;
    private boolean graphicalNotationDefined;
    private String resource;
    private String deploymentUrl;
    private String description;
    private int version;
    private String url;
    private boolean suspended;
    private String deploymentId;
    private String name;
    private String id;
    private String category;
    private boolean startFormDefined;
    private String key;

    public void setDiagramResource(String diagramResource) {
        this.diagramResource = diagramResource;
    }

    public void setGraphicalNotationDefined(boolean graphicalNotationDefined) {
        this.graphicalNotationDefined = graphicalNotationDefined;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setDeploymentUrl(String deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStartFormDefined(boolean startFormDefined) {
        this.startFormDefined = startFormDefined;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDiagramResource() {
        return diagramResource;
    }

    public boolean isGraphicalNotationDefined() {
        return graphicalNotationDefined;
    }

    public String getResource() {
        return resource;
    }

    public String getDeploymentUrl() {
        return deploymentUrl;
    }

    public String getDescription() {
        return description;
    }

    public int getVersion() {
        return version;
    }

    public String getUrl() {
        return url;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public boolean isStartFormDefined() {
        return startFormDefined;
    }

    public String getKey() {
        return key;
    }
}
