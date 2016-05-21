package com.uiyllong.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by uilong on 2016/5/21.
 */
public class Course implements Serializable {

    private Integer id;
    private String cnumber;
    private String cname;
    private Set students = new HashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set getStudents() {
        return students;
    }

    public void setStudents(Set students) {
        this.students = students;
    }
}
