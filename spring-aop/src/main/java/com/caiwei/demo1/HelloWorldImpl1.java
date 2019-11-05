package com.caiwei.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:00
 * @Version 1.0
 */
@Service
public class HelloWorldImpl1 implements HelloWorld {

    @Autowired
    Abs1 abs;
    public void printHelloWorld() {
        abs.set("a-1","a-1");
        System.out.println(abs.getMap());
        System.out.println("------11111------按下HelloWorld1.printHelloWorld()-----11111111-------");
    }

    public String doPrint(ParamObj paramObj) {
        System.out.println(paramObj.toString());
        //System.out.println("------1111111------打印HelloWorldImpl1-----1111111------");
        return "abc";
    }
}
