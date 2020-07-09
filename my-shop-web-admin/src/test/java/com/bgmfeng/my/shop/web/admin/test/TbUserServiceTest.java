package com.bgmfeng.my.shop.web.admin.test;

import com.bgmfeng.my.shop.domain.TbUser;
import com.bgmfeng.my.shop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: TbUserServiceTest.java
 * @ Time    : 2020/7/9 1:53
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testSelectAll(){
        List<TbUser> tbUsers = tbUserService.selectAll();
        for (TbUser tbUser: tbUsers){
            System.out.println(tbUser.getUsername());
        }
    }

    @Test
    public void testInsert(){
        TbUser tbUser = new TbUser();
        tbUser.setUsername("Kevin");
        tbUser.setPassword("Tim");

        tbUserService.insert(tbUser);
    }

    @Test
    public void testGetById(){
        TbUser tbUser = tbUserService.getById(36L);
        System.out.println(tbUser.getUsername());
    }

    @Test
    public void update(){
        TbUser tbUser = tbUserService.getById(36L);
        tbUser.setUsername("Cherry");
        tbUserService.update(tbUser);
    }

    @Test
    public void testSelectByUsername(){
        List<TbUser> tbUsers = tbUserService.selectByUsername("Cherry");
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }

}
