package com.caiwei.demo1;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:01
 * @Version 1.0
 */
public class    TimeHandler implements MethodBeforeAdvice, AfterReturningAdvice {


    public void before(Method method, Object[] args, Object target) throws Throwable {
        for(Object obj : args) {
            System.out.println("before       "+obj.toString());
        }
        //System.out.println("代理----前----CurrentTime = " + System.currentTimeMillis());

    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("return      "+returnValue);
    }
}
