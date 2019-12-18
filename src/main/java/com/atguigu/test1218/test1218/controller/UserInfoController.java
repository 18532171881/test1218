package com.atguigu.test1218.test1218.controller;

import com.atguigu.test1218.test1218.bean.UserInfo;
import com.atguigu.test1218.test1218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 24923 on 2019/12/18 9:28
 */
@RestController
public class UserInfoController {

    //调用服务层
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }
}
