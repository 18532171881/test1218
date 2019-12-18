package com.atguigu.test1218.test1218.mapper;

import com.atguigu.test1218.test1218.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by 24923 on 2019/12/18 9:20
 */
//mapper的泛型 表示当前mapper要操作的实体类
//数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {

}
