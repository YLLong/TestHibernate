package com.uiyllong.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by uilong on 2016/5/21.
 */
public class Student implements Serializable {

    private Integer id;
    private String snumber;
    private String sname;
    private Integer sage;
    private Set courses = new HashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }
}
