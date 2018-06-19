package com.m2e.mapper;

import org.springframework.stereotype.Component;

import com.m2e.bean.db.User;

//mapper接口，相当于dao接口

public interface UserMapper {

  //根据id查询用户信息
  public User findUserById(int id) throws Exception;

} 