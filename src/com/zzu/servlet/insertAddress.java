package com.zzu.servlet;

import com.zzu.entity.address;
import com.zzu.service.addressService;
import com.zzu.service.addressServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 62599 on 2017/06/05.
 */
public class insertAddress extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应数据编码格式
        resp.setCharacterEncoding("UTF-8");
        //设置请求编码格式
        req.setCharacterEncoding("UTF-8");
        addressService addressService = new addressServiceImpl();
        String name = req.getParameter("name");
        String salary = req.getParameter("salary");
        String date = req.getParameter("birthday");

        address address = new address(null,name,salary,date);
        addressService.insertAddress(address);
        req.getRequestDispatcher("/querryAllAddress").forward(req,resp);

    }
}