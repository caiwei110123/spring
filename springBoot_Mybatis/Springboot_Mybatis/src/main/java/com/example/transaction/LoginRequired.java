package com.example.transaction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义登录拦截器注解
 ElementType.METHOD:为运行在方式上
 ElementType.TYPE:为运行在class、interface上
 @Retention(RetentionPolicy.RUNTIME)为元注解,在编译时
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {

}