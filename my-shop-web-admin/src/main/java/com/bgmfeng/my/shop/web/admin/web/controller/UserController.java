package com.bgmfeng.my.shop.web.admin.web.controller;

import com.bgmfeng.my.shop.commons.dto.BaseResult;
import com.bgmfeng.my.shop.domain.TbUser;
import com.bgmfeng.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * 用户管理
 *
 * @ Author  : Tim Wang
 * @ FileName: UserController.java
 * @ Time    : 2020/7/10 14:55
 */

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private TbUserService tbUserService;

    /**
     * 跳转到用户列表页
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        List<TbUser> tbUsers = tbUserService.selectAll();
        model.addAttribute("tbUser", tbUsers);
        return "user_list";
    }

    /**
     * 跳转用户表单页面
     *
     * @return
     */
    @RequestMapping(value = "from", method = RequestMethod.GET)
    public String form() {
        return "user_form";
    }

    /**
     * 保存用户信息
     *
     * @param tbUser
     * @return
     */

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(TbUser tbUser, RedirectAttributes redirectAttributes, Model model) {
        BaseResult baseResult = tbUserService.save(tbUser);

        //保存成功
        if (baseResult.getStatus() == 200) {
            // session 放数据
            redirectAttributes.addFlashAttribute("baseResult", baseResult);
            return "redirect:/user/list";

        } else {
            model.addAttribute("baseResult", baseResult);
            return "user_form";
        }

    }
}
