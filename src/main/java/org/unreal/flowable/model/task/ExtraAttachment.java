package org.unreal.flowable.model.task;

public class ExtraAttachment {

    /**
     * externalUrl : http://activiti.org
     * name : Simple attachment
     * description : Simple attachment description
     * type : simpleType
     */
    private String externalUrl;
    private String name;
    private String description;
    private String type;

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
