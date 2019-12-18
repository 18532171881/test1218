package com.atguigu.test1218.test1218.impl;

import com.atguigu.test1218.test1218.bean.UserInfo;
import com.atguigu.test1218.test1218.mapper.UserInfoMapper;
import com.atguigu.test1218.test1218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 24923 on 2019/12/18 9:23
 */
@Service
public class UserServiceImpl implements UserService {

    //表示当前UserInfoMapper在容器中
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
