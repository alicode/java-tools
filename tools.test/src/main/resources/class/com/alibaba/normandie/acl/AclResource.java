package com.alibaba.normandie.acl;

import java.io.Serializable;

/**
 * Created by huangjun on 6/24/16.
 */
public class AclResource implements Serializable{

    private static final long serialVersionUID = -3644957863919176726L;

    private Integer resourceId;
    private String  resource;
    private String  label;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
