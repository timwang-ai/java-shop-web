package com.bgmfeng.my.shop.web.admin.web.controller;

import com.bgmfeng.my.shop.commons.constant.ConstantUtils;
import com.bgmfeng.my.shop.domain.User;
import com.bgmfeng.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @ Author  : Tim Wang
 * @ FileName: LoginController.java
 * @ Time    : 2020/7/8 1:49
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转登陆页面
     *
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * 登陆逻辑
     *
     * @param email
     * @param password
     * @param httpServletRequest
     * @return
     */

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password, HttpServletRequest httpServletRequest) {
        User user = userService.login(email, password);

        // 登陆失败
        if (user == null) {
            return login();

            //登陆成功
        } else {
            //将登陆信息放入会话
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER, user);
            return "redirect:/main";
        }
    }

    /**
     * 注销
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        return login();
    }
}
