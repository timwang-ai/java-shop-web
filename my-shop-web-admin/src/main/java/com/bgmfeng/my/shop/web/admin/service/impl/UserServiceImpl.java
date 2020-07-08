package com.bgmfeng.my.shop.web.admin.service.impl;

import com.bgmfeng.my.shop.domain.User;
import com.bgmfeng.my.shop.web.admin.dao.UserDao;
import com.bgmfeng.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserServiceImpl.java
 * @ Time    : 2020/7/8 1:46
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String email, String password) {
        return userDao.getUser(email, password);
    }
}
