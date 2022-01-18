package com.example.dantu.dao;

import com.example.dantu.bean.User;

public class LoginDaoImpl implements LoginDao{
    @Override
    public User  logindao(User u) {
        //就在这里写数据库的东西
        int id=u.getU_id();
        String pwd=u.getU_pwd();
        //访问数据库
        //确定有这个信息
        User user =new User(1001,"宜瑞","123","18888888888",1,0);

        return user;
    }
}
