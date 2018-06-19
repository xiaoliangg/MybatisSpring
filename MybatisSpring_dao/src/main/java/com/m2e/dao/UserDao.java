package com.m2e.dao;

import com.m2e.bean.db.User;

public interface UserDao {

    //根据用户id查询用户信息
    public User findUserById(int id) throws Exception;

}