/**
 * Project: lsc-user-api
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

import java.util.List;

/**
 * TODO Comment of AclRoleForEdit
 * 
 * @author tony.huangj 9:46:45 AM
 */
public class AclRoleForEdit extends AbstractAclRole {
    private static final long serialVersionUID = 2533787364601444538L;

    private Integer           roleId;
    private String            description;
    private List<Integer>     canBeEditRoleIds;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getCanBeEditRoleIds() {
        return canBeEditRoleIds;
    }

    public void setCanBeEditRoleIds(List<Integer> canBeEditRoleIds) {
        this.canBeEditRoleIds = canBeEditRoleIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
