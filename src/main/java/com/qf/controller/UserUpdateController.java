package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZHOU
 * @create 2020/11/9 20:13
 */
@WebServlet("/update")
public class UserUpdateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String sex = req.getParameter("sex");
        String address = req.getParameter("address");

        User user = new User(id, username, sex, address);
        UserServiceImpl userService = new UserServiceImpl();
        Integer i = userService.updateById(user);

        if (i > 0){
            resp.sendRedirect("user");
        }

    }
}
