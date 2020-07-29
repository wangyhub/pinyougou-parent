package com.pinyougou.entity;

import java.io.Serializable;

/**
 * @program: pinyougou-parent
 * @Date: 2020/7/29 15:25
 * @Author: wangy
 * @Description: 返回结果封装
 */
public class Result implements Serializable {
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
