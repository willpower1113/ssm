package com.willpower.service.impl;

import com.willpower.dao.IUserMapper;
import com.willpower.entity.User;
import com.willpower.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> filterUser(User user) {
        return userMapper.filterUser(user);
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

}
