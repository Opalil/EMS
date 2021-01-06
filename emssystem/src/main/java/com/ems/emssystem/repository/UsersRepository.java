package com.ems.emssystem.repository;

import com.ems.emssystem.model.UserInfo;
import org.springframework.data.repository.CrudRepository;


public interface UsersRepository extends CrudRepository<UserInfo, Long>{
}
