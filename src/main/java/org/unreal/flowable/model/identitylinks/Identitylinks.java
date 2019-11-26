package org.unreal.flowable.model.identitylinks;

public class Identitylinks {

    /**
     * type : customType
     * user : john
     * url : http://localhost:8182/runtime/process-instances/5/identitylinks/users/john/customType
     * group : null
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
