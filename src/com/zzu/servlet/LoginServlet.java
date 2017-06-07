package com.zzu.servlet;

import com.zzu.entity.user;
import com.zzu.service.userService;
import com.zzu.service.userServiceImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

/**
 * Created by 62599 on 2017/06/04.
 */
public class LoginServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应数据编码格式
        resp.setCharacterEncoding("UTF-8");
        //设置请求编码格式
        req.setCharacterEncoding("UTF-8");
        userService us = new userServiceImpl();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String validationCode = req.getParameter("validationCode");
        String code = (String) req.getSession().getAttribute("validationCode");
        user user = new user();
        user.setUsername(username);
        user.setPassword(password);
        user user1 = new user();
        user1 = us.login(user);
        req.setAttribute("user",user);
        req.getSession().setAttribute("username",username);
        if(user1 != null && code.equals(validationCode)){
            req.getRequestDispatcher("/querryAllAddress").forward(req,resp);
        }else {
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }
}