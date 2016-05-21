package com.uiyllong.javabean;

import java.io.Serializable;

/**
 * Created by uilong on 2016/5/21.
 */
public class Order implements Serializable {

    private Integer xid;
    private String price;
    private Customer customer;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
