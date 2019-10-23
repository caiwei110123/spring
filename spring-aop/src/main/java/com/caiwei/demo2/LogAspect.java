package com.caiwei.demo2;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(100)
public class LogAspect {
    //定义切点：包含任意参数的、任意返回值、的公共方法sayName
    @Pointcut("execution(public * *sayName(..))")
    private void log(){}

    //定义环绕通知：处理日志注入
    @Around("log()")
    private Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();

        System.out.println("before, params:" + JSONObject.toJSONString(args));
        Object result = proceedingJoinPoint.proceed();
        System.out.println("after, result:" + JSONObject.toJSONString(result));
        return result;
    }
}