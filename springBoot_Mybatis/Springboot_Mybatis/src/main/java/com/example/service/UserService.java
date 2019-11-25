package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.transaction.MyTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    public User Sel(int id){
        return userMapper.Sel(id);
    }

    @MyTransactional
    public int insert(User user){
        return userMapper.insert(user);
    }
}
