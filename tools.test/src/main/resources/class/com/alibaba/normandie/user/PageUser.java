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
/*
 * Copyright (C) 2013-2016 aqnote.com<madding.lip@gmail.com>. 
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */ com.alibaba.normandie.user;

import java.util.List;

/**
 * TODO Comment of PageUser
 * 
 * @author tony.huangj 5:19:55 PM
 */
public class PageUser {
    private int                   pageNum;
    private int                   pageSize;
    private int                   total;   // total items
    private int                   pages;

    private List<UserQueryResult> pageData;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<UserQueryResult> getPageData() {
        return pageData;
    }

    public void setPageData(List<UserQueryResult> pageData) {
        this.pageData = pageData;
    }

}
