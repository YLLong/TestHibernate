package com.uiyllong.javabean;

import java.io.Serializable;

/**
 * Created by uilong on 2016/5/21.
 */
public class Customer implements Serializable {

    private Integer cid;
    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
