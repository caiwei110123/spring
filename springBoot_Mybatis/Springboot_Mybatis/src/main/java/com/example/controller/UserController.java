package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.transaction.LoginRequired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @LoginRequired
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    //@RequestMapping("insert/{id}")
    //public String insert(@PathVariable int id){
    //    User user = new User();
    //    user.setId(id);
    //    user.setRealName(id+"realname");
    //    user.setPassWord(id+"password");
    //    user.setUserName(id+"username");
    //    userService.insert(user);
    //    return userService.Sel(id).toString();
    //}
}
