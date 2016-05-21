package com.uiyllong.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**多对一就将 person 属性 注销
 * 一对一不用注销person
 * 一对多使用set集合person属性
 * Created by uilong on 2016/5/21.
 */
public class Room implements Serializable {

    private Integer id;
    private String address;
    //private Person person;
    private Set person = new HashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //public Person getPerson() {
    //    return person;
    //}
    //
    //public void setPerson(Person person) {
    //    this.person = person;
    //}

    public Set getPerson() {
        return person;
    }

    public void setPerson(Set person) {
        this.person = person;
    }
}
