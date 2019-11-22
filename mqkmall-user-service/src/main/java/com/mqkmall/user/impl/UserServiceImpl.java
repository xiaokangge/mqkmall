package com.mqkmall.user.impl;


import com.mqkmall.user.bean.UmsMember;
import com.mqkmall.user.mapper.UserMapper;
import com.mqkmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
