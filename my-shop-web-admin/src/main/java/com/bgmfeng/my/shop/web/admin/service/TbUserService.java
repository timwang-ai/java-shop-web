package com.bgmfeng.my.shop.web.admin.service;

import com.bgmfeng.my.shop.commons.dto.BaseResult;
import com.bgmfeng.my.shop.domain.TbUser;

import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: TbUserService.java
 * @ Time    : 2020/7/9 1:41
 */
public interface TbUserService {

    public List<TbUser> selectAll();

    BaseResult save(TbUser tbUser);

    void delete(Long id);

    TbUser getById(Long id);

    void update(TbUser tbUser);

    List<TbUser> selectByUsername(String username);

    /**
     * 用户登陆
     *
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email, String password);

    /**
     * 搜索功能
     *
     * @param keyword
     * @return
     */
    List<TbUser> search(String keyword);
}
