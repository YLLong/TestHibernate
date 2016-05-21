package com.uiyllong.beans;

import java.io.Serializable;

/**
 * Created by uilong on 2016/5/21.
 */
public class Detail implements Serializable {

    private Integer id;
    private String truename;
    private Login login;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
