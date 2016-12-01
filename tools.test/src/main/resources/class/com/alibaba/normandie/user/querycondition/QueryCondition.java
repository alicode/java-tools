/**
 * Project: lsc-user-api
 * 
 * File Created at Jul 1, 2016
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
package com.alibaba.normandie.user.querycondition;

/**
 * TODO Comment of QueryCondition 
 * @author tony.huangj 
 * 5:27:42 PM	
 *
 */
public class QueryCondition {
    private Integer userId; // the user who call page query, if the user role is admin or maintenance, can get all user data.
    private String  name;  // email,name use for like query
    
    private Integer pageNum; //start at 1
    private Integer pageSize;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
 
    
}
