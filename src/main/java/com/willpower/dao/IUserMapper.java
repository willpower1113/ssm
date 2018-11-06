package com.willpower.dao;

import com.willpower.entity.User;

import java.util.List;

public interface IUserMapper {
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
    模糊查询
     */
    List<User> filterUser(User user);

}
