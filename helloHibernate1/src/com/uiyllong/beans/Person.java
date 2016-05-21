package com.uiyllong.beans;

import java.io.Serializable;

/**
 * Created by uilong on 2016/5/21.
 */
public class Person implements Serializable {

    private Integer id;
    private String name;
    private Room room;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
