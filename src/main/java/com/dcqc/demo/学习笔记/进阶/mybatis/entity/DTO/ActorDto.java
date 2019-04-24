package com.dcqc.demo.学习笔记.进阶.mybatis.entity.DTO;

import java.sql.Timestamp;

public class ActorDto {
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
