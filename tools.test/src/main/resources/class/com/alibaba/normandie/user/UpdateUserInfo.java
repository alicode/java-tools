/**
 * Project: lsc-user-api
 * 
 * File Created at Jul 11, 2016
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
package com.alibaba.normandie.user;

/**
 * TODO Comment of UpdateUserInfo 
 * @author tony.huangj 
 * 2:24:20 PM	
 *
 */
public class UpdateUserInfo extends JoinInfo {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
}
