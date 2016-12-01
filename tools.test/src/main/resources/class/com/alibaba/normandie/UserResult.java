/*
 * Copyright (C) 2013-2016 aqnote.com<madding.lip@gmail.com>. 
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */ com.alibaba.normandie;

/**
 * Created by huangjun on 6/24/16.
 */
public class UserResult<T> {

    private T data;
    private int code;
    private String message;
    private boolean success;

    public UserResult(){

    }

    public UserResult(T data, UserResultCode resultCode, boolean success) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.success = success;
    }

    public UserResult(T data, int code, String message, boolean success) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    
}
