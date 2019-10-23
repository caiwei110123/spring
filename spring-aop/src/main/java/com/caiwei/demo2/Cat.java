package com.caiwei.demo2;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Cache(60)
    public String sayName(String name, Integer num) {
        return "this is cat " + name + "," + num;
    }
}