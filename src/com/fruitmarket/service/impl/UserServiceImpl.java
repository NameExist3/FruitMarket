package com.fruitmarket.service.impl;

import com.fruitmarket.base.BaseDao;
import com.fruitmarket.base.BaseServiceImpl;
import com.fruitmarket.mapper.UserMapper;
import com.fruitmarket.po.User;
import com.fruitmarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseDao<User> getBaseDao() {
        return userMapper;
    }
}
