/**
 * Project: lsc-user-api
 * 
 * File Created at Jul 13, 2016
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

import java.io.Serializable;
import java.util.List;

/**
 * TODO Comment of Page
 * 
 * @author tony.huangj 5:42:13 PM
 */
public class Page<T> implements Serializable{
    private static final long serialVersionUID = -8592138125559243557L;
    
    private int     pageNum;
    private int     pageSize;
    private int     total;   // total items
    private int     pages;
    private List<T> pageData;
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
    public List<T> getPageData() {
        return pageData;
    }
    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }
    
}
