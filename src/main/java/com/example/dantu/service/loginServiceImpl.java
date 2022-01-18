package com.example.dantu.service;


import com.example.dantu.bean.User;
import com.example.dantu.dao.LoginDao;
import com.example.dantu.dao.LoginDaoImpl;

public class loginServiceImpl implements loginService{
    @Override
    public User  loginService(User u) {
        LoginDao ld=new LoginDaoImpl();
        return ld.logindao(u);
    }
}

