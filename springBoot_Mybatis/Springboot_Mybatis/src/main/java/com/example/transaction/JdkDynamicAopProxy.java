package com.example.transaction;

import org.springframework.aop.framework.AopProxy;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/26  下午12:51
 * @Version 1.0
 */
@Configuration
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler, Serializable {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====================transaction method :" +
            method.getDeclaringClass().getName() + "." + method.getName());
        Object object = method.invoke(args);
        System.out.println("================= result :" + object);
        return object;
    }

    @Override
    public Object getProxy() {
        return null;
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return null;
    }
}
