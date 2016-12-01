/**
 * Project: lsc-biz-seller
 * 
 * File Created at Jul 8, 2016
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
/*
 * Copyright (C) 2013-2016 aqnote.com<madding.lip@gmail.com>. 
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */ com.alibaba.normandie.acl;

/**
 * TODO Comment of AclResourceStatus
 * 
 * @author tony.huangj 8:27:52 AM
 */
public class AclResourceStatus {
    private Integer aclResourceId;
    private Integer aclRoleId;
    private String  aclResourceName;
    private String  aclResourceDescription;
    private String  aclTags;
    private boolean enable;

    public Integer getAclResourceId() {
        return aclResourceId;
    }

    public void setAclResourceId(Integer aclResourceId) {
        this.aclResourceId = aclResourceId;
    }

    public Integer getAclRoleId() {
        return aclRoleId;
    }

    public void setAclRoleId(Integer aclRoleId) {
        this.aclRoleId = aclRoleId;
    }

    public String getAclResourceName() {
        return aclResourceName;
    }

    public void setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
    }

    public String getAclResourceDescription() {
        return aclResourceDescription;
    }

    public void setAclResourceDescription(String aclResourceDescription) {
        this.aclResourceDescription = aclResourceDescription;
    }

    public String getAclTags() {
        return aclTags;
    }

    public void setAclTags(String aclTags) {
        this.aclTags = aclTags;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "AclResourceStatus [aclResourceId=" + aclResourceId + ", aclRoleId=" + aclRoleId
                + ", aclResourceName=" + aclResourceName + ", aclResourceDescription="
                + aclResourceDescription + ", aclTags=" + aclTags + ", enable=" + enable + "]";
    }

}
