package com.bgmfeng.my.shop.web.admin.dao;

import com.bgmfeng.my.shop.domain.User;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserDao.java
 * @ Time    : 2020/7/8 1:33
 */
public interface UserDao {
    /**
     * 根据邮箱和密码获取用户信息
     *
     * @param email    邮箱
     * @param password 密码
     * @return 用户
     */
    public User getUser(String email, String password);
}
