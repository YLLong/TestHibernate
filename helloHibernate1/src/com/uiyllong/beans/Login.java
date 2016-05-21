package com.uiyllong.beans;

import java.io.Serializable;

/**
 * 一对一关联 Detail 类
 * Created by uilong on 2016/5/21.
 */
public class Login implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Detail detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}
