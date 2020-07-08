package com.bgmfeng.my.shop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ Author  : Tim Wang
 * @ FileName: MainController.java
 * @ Time    : 2020/7/8 1:50
 */
@Controller
public class MainController {


    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(){
        return "main";
    }
}
