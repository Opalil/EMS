package com.ems.emssystem.service;

import com.ems.emssystem.model.UserInfo;

import java.util.List;

public interface UserService {

    /**
     *
     * @return
     */
    List<UserInfo> findAll();
}
