/**
 * Project: lsc-user-api
 * 
 * File Created at Jul 14, 2016
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
package com.alibaba.normandie.acl;

import java.util.List;

import com.alibaba.normandie.UserResult;
import com.alibaba.normandie.user.Page;
import com.alibaba.normandie.user.querycondition.QueryCondition;

/**
 * TODO Comment of AclService 
 * @author tony.huangj 
 * 1:51:37 AM	
 *
 */
public interface AclService {

    /**
     * get user role and acl resources by userId
     * 
     * @param userId
     * @return
     */
    public UserResult<AclRole> findAclRole(Integer userId);

    /**
     * get user role and acl resources by email(logon email)
     * 
     * @param email
     * @return
     */
    public UserResult<AclRole> findAclRole(String email);

    /**
     * The user has permission or not.
     * 
     * @param userId user primary id
     * @param resource acl resource
     * @return
     */
    public boolean hasPermission(Integer userId, String resource);

    public UserResult<List<AclResourceStatus>> findAclResource(Integer operatorUserId, Integer aclRoleId);

    public UserResult<Void> addAclResourceToRole(Integer operatorUserId, Integer aclRoleId,
                                                 Integer aclResourceId);

    public UserResult<Void> deleteAclResourceFromRole(Integer operatorUserId, Integer aclRoleId,
                                                      Integer aclResourceId);

    public UserResult<Void> addAclRole(Integer operatorUserId, AclRoleForEdit aclRole);

    public UserResult<Void> editAclRole(Integer operatorUserId, AclRoleForEdit aclRole);
    
    public UserResult<AclRoleForEdit> findAclRoleForEdit(Integer operatorUserId, Integer aclRoleId);
    
    public UserResult<List<AclRole>> findAllAclRole(Integer operatorUserId);
    
    public UserResult<Page<AclRole>> findByPageCondition(QueryCondition queryCondition);
}
