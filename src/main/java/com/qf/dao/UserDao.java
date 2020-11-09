package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/9 11:44
 */
public interface UserDao {

    List<User> selectAll();

    User selectOne(Integer id);

    Integer updateById(User user);

    Integer deleteById(Integer id);

    Integer add(User user);
}
