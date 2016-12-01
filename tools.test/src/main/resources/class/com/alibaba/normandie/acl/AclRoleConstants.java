/**
 * Project: lsc-user-api
 * 
 * File Created at Jul 5, 2016
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

/**
 * TODO Comment of AclRoleConstants
 * 
 * @author tony.huangj 8:04:37 PM
 */
public interface AclRoleConstants {
    String ROLE_ACL_MANAGER        = "acl manager";
    String ROLE_ADMIN              = "admin";
    String ROLE_BACKEND_OPERATION  = "backend operation";
    String ROLE_BACKEND_READ_ONLY  = "backend read only";
    String ROLE_FINANCE            = "finance";
    String ROLE_LOGIN_ON_GOING     = "login_on_going";
    String ROLE_MAINTENANCE        = "maintenance";
    String ROLE_MONITORING_API     = "monitoring api";
    String ROLE_QC                 = "quality control - user";
    String ROLE_SELLER_FULL_ACCESS = "seller";
    String ROLE_SELLER_CATALOG     = "seller - catalog management";
    String ROLE_SELLER_ORDER       = "seller - order management";
    String ROLE_SELLER_STOCK       = "seller - stock update";
    String ROLE_SELLER_SUPPORT     = "seller - support";
    String ROLE_SELLER_API         = "seller - Webservice API";
    String ROLE_SELLER_API_ORDER   = "seller - Webservice API Order Access";
    String ROLE_SELLER_API_PRODUCT = "seller - Webservice API Product Access";
    String ROLE_SELLER_SETUP       = "seller setup";
}
