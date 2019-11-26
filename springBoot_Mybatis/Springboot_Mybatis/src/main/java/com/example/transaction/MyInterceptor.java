package com.example.transaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/26  下午1:01
 * @Version 1.0
 */

@Component
public class MyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        LoginRequired loginRequired = this.findAnnotation((HandlerMethod) handler, LoginRequired.class);

        if (loginRequired == null) {
            return false;
        } else {
            System.out.println("开始验证");
            if ("pass".equals(request.getHeader("token"))) {
                System.out.println("111111111");
                return true; //放行
            } else {
                System.out.println("222222222222");
                return true; //拦截
            }
        }
        //        return true;  //false拦截,true为放行
    }
    /**
     handlerMethod->这里可理解为请求,请求中包含请求路径,
     getBeanType() ->返回请求方法的类型,(一般为className)
     getAnnotation()->返回该类型上的指定字节码的注解
     */
    private <T extends Annotation> T findAnnotation(HandlerMethod handlerMethod, Class<T> annotationType) {
        T annotation = handlerMethod.getBeanType().getAnnotation(annotationType);
        if (annotation != null) {
            return annotation;
        }
        return handlerMethod.getMethodAnnotation(annotationType);
    }
}

