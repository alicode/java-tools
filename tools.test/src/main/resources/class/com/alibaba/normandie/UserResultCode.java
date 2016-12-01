/**
 * Project: lsc-user-api
 * 
 * File Created at Jun 30, 2016
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
 */ com.alibaba.normandie;

/**
 * TODO Comment of UserResultCode
 * 
 * @author tony.huangj 3:05:48 PM
 */
public class UserResultCode {

    public static UserResultCode SUCCESS                  = new UserResultCode(1, "success");

    public static UserResultCode ILLEGAL_PARAMETER        = new UserResultCode(400,
            "illegal_parameter");
    public static UserResultCode NO_PERMISSION            = new UserResultCode(401,
            "no_permission");
    public static UserResultCode OPERATOR_NOT_EXIST       = new UserResultCode(402,
            "operator_not_exist");

    public static UserResultCode NOT_EXIST                = new UserResultCode(500, "not_exist");

    public static UserResultCode UPDATE_USER_FAIL         = new UserResultCode(501,
            "update_user_fail");

    public static UserResultCode PASSWORD_NOT_MATCH       = new UserResultCode(502,
            "password_not_match");
    public static UserResultCode EXIST_USER               = new UserResultCode(503, "exist user");

    public static UserResultCode ROLE_NOT_EXIST           = new UserResultCode(600, "role not exist");
    public static UserResultCode LANGUAGE_NOT_EXIST           = new UserResultCode(601, "language not exist");

    public static UserResultCode DB_OPERATION_UPDATE_FAIL = new UserResultCode(996, "update fail");
    public static UserResultCode DB_OPERATION_DELETE_FAIL = new UserResultCode(997, "delte fail");
    public static UserResultCode DB_OPERATION_ADD_FAIL    = new UserResultCode(998, "add fail");
    public static UserResultCode SYSTEM_EXCEPTION         = new UserResultCode(999,
            "system_exception");

    private int                  code;
    private String               message;

    public UserResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
