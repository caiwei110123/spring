package com.example.mapper;

import com.example.entity.User;
import com.example.transaction.MyTransactional;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    @MyTransactional
    User Sel(int id);

    @MyTransactional
    int insert(User user);
}
