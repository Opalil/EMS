package com.ems.emssystem.service;

import com.ems.emssystem.repository.UsersRepository;
import com.ems.emssystem.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersRepository userRepo;

    public List<UserInfo> findAll(){
        Iterable<UserInfo> allUsers = userRepo.findAll();
        List<UserInfo> listOfUsers = new ArrayList<>();
        allUsers.forEach(listOfUsers::add);
        return listOfUsers;
    }


}
