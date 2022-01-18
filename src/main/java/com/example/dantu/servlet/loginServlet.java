package com.example.dantu.servlet;

import com.example.dantu.bean.User;
import com.example.dantu.service.loginService;
import com.example.dantu.service.loginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 这个注解就是我们起的名字，为了让前端的页面来访问
* */
@WebServlet("/login")
public class loginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_id=req.getParameter("u_id");
        String u_pwd=req.getParameter("u_pwd");
        User u =new User();
        u.setU_id(Integer.valueOf(u_id));
        u.setU_pwd(u_pwd);
        //实现登陆服务层的业务逻辑层
        loginService l = new loginServiceImpl();
        User user=l.loginService(u);
        /*if (flag==true){
            //此时此刻，就进入登录界面
        }else {
            //到登录注册界面，重新登陆
        }*/
        if (true){
            //说明确实有这条值
            req.setAttribute("user",user);
            req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
        }else {

        }
        System.out.println("账户："+u.getU_id()+"   密码："+u.getU_pwd());
    }
}

