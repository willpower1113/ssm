package com.willpower.service;

import com.willpower.entity.User;

import java.util.List;

public interface IUserService {

    /*
    添加用户，支持多个
     */
    int addUser(User user);

    /*
    查询所有
     */
    List<User> selectAllUser();

    /*
    按Id查询用户
     */
    User login(User user);

    /*
    登录
     */
    List<User> filterUser(User user);
}
