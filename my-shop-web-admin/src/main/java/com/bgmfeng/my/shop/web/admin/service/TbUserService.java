package com.bgmfeng.my.shop.web.admin.service;

import com.bgmfeng.my.shop.domain.TbUser;

import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: TbUserService.java
 * @ Time    : 2020/7/9 1:41
 */
public interface TbUserService {

    public List <TbUser> selectAll();

    void insert(TbUser tbUser);

    void delete(Long id);

    TbUser getById(Long id);

    void update(TbUser tbUser);

    List<TbUser> selectByUsername(String username);
}
