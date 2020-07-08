package com.bgmfeng.my.shop.web.admin.service;

import com.bgmfeng.my.shop.domain.User;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserService.java
 * @ Time    : 2020/7/8 1:45
 */
public interface UserService {
    /**
     * 登陆
     *
     * @param email    邮箱
     * @param password 密码
     * @return 用户
     */
    public User login(String email, String password);
}
