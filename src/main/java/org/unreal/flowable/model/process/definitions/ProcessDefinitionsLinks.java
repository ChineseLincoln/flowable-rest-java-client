package org.unreal.flowable.model.process.definitions;

public class ProcessDefinitionsLinks {

    /**
     * type : candidate
     * user : null
     * url : http://localhost:8182/repository/process-definitions/oneTaskProcess%3A1%3A4/identitylinks/groups/admin
     * group : admin
     */
    private String type;
    private String user;
    private String url;
    private String group;

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUrl() {
        return url;
    }

    public String getGroup() {
        return group;
    }
}
