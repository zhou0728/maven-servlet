package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/9 12:02
 */
@WebServlet("/user")
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> users = userService.selectAll();

        req.setAttribute("users",users);
        req.getRequestDispatcher("userList.jsp").forward(req,resp);
    }
}
