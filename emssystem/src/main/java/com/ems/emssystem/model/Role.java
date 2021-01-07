package com.ems.emssystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private long role_id;

    private String role_name;

    private int elementkey;

    public Role(){

    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public int getElementkey() {
        return elementkey;
    }

    public void setElementkey(int elementkey) {
        this.elementkey = elementkey;
    }
}
