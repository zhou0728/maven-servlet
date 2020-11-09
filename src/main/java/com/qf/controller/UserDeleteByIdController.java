package com.qf.controller;

import com.qf.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZHOU
 * @create 2020/11/9 20:22
 */
@WebServlet("/delete")
public class UserDeleteByIdController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        UserServiceImpl userService = new UserServiceImpl();
        Integer i = userService.deleteById(id);

        if (i > 0){
            resp.sendRedirect("user");
        }
    }
}
