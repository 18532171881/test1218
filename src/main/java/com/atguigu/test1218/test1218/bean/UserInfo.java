package com.atguigu.test1218.test1218.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by 24923 on 2019/12/18 8:47
 */
//实体类包含 属性，get set方法
@Data
public class UserInfo {
    //通用mapper的注解
    @Id//表示主键
    @Column//普通的字段列
    @GeneratedValue(strategy = GenerationType.IDENTITY)//获取数据库主键自增这是mysql oracle的自增是auto
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
