package com.ems.emssystem.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    private String userName;

    private Date creationTime;

    public UserInfo() {

    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (user_id ^ (user_id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof UserInfo))
            return false;
        UserInfo other = (UserInfo) obj;
        if (user_id != other.user_id)
            return false;
        return true;
    }

    public String toString(){
        return "User_ID = " + user_id + ", UserName = " + userName + ", creationTime = " + creationTime;
    }
}
