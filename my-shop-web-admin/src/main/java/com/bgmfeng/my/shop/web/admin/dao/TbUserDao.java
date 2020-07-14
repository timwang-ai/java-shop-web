package com.bgmfeng.my.shop.web.admin.dao;

import com.bgmfeng.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: TbUserDao.java
 * @ Time    : 2020/7/9 1:39
 */

@Repository
public interface TbUserDao {
    /**
     * 查询用户全部信息
     *
     * @return TbUser
     */
    public List<TbUser> selectAll();

    /**
     * 新增
     *
     * @param tbUser
     */
    void insert(TbUser tbUser);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 根据ID查询用户信息
     *
     * @param id
     * @return
     */
    TbUser getById(Long id);

    /**
     * 更新
     *
     * @param tbUser
     */
    void update(TbUser tbUser);

    /**
     * 根据用户名 进行模糊匹配
     *
     * @param username
     * @return
     */
    List<TbUser> selectByUsername(String username);

    /**
     * 根据邮箱查询用户信息
     *
     * @param email
     * @return
     */
    TbUser getByEmail(String email);

    /**
     * 搜索
     *
     * @param tbUser
     * @return
     */
    List<TbUser> search(TbUser tbUser);

}
