package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/9 11:45
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAll() {
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf-8", "root", "1234");
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from user");
            List list = new ArrayList();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setSex(resultSet.getString("sex"));
                user.setAddress(resultSet.getString("address"));
                list.add(user);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User selectOne(Integer id) {
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf-8", "root", "1234");
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from user where id="+id);
            User user = new User();
            while (resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setSex(resultSet.getString("sex"));
                user.setAddress(resultSet.getString("address"));
            }
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Integer updateById(User user) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf-8", "root", "1234");
            ps = con.prepareStatement("update user set username=?,sex=?,address=? where id=?");
            ps.setObject(1,user.getUsername());
            ps.setObject(2,user.getSex());
            ps.setObject(3,user.getAddress());
            ps.setObject(4,user.getId());
            int i = ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf-8", "root", "1234");
            ps = con.prepareStatement("delete from user where id=?");
            ps.setObject(1,id);
            int i = ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Integer add(User user) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf-8", "root", "1234");
            ps = con.prepareStatement("insert into user values(null,?,?,?)");
            ps.setObject(1,user.getUsername());
            ps.setObject(2,user.getSex());
            ps.setObject(3,user.getAddress());
            int i = ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
