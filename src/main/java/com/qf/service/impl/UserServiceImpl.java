package com.qf.service.impl;

import com.qf.dao.impl.UserDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserService;

import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/9 12:00
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAll() {
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao.selectAll();
    }
}
