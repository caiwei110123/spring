package com.caiwei.demo1;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:00
 * @Version 1.0
 */
public class HelloWorldImpl2 implements HelloWorld {

    public void printHelloWorld() {
        System.out.println("------222222------按下HelloWorld2.printHelloWorld()------2222222------");
    }

    public String doPrint(ParamObj paramObj) {
        System.out.println("-------22222-----打印HelloWorldImpl2------22222-----");
        return "abc";
    }

}
