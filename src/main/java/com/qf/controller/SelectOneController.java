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
 * @create 2020/11/9 20:01
 */
@WebServlet("/selectOne")
public class SelectOneController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        UserServiceImpl userService = new UserServiceImpl();

        User user = userService.selectOne(id);

        req.setAttribute("user",user);
        req.getRequestDispatcher("user_update.jsp").forward(req,resp);
    }
}
