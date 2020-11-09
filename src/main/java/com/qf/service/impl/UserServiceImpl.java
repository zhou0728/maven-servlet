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
    private UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectOne(Integer id) {
        return userDao.selectOne(id);
    }

    @Override
    public Integer updateById(User user) {
        return userDao.updateById(user);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public Integer add(User user) {
        return userDao.add(user);
    }
}
