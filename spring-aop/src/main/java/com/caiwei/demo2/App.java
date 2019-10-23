package com.caiwei.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfig.class);

        Animal animal = applicationContext.getBean("cat", Cat.class);
        String result = animal.sayName("rudytan", 12);
        //String result1 = animal.sayName("rudytan", 12);
        //String result2 = animal.sayName("rudytan", 12);
        //String result3 = animal.sayName("rudytan", 13);
        //String result4 = animal.sayName("rudytan", 13);
        //System.out.println(result);
    }
}