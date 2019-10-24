package com.caiwei.demo3_huanraotongzhi;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Spring aop  Aspect demo
 */
@Component
@Aspect
public class AspectBean {

	@Pointcut("execution(* com.caiwei.demo3_huanraotongzhi.UserDaoImpl.*(..))" )
	public void anyWay()
	{
		System.out.println("111111111");
	}
	//
	//@Before("anyWay() && args(name)")
	//public void doValidate(String name)
	//{
	//	System.out.println("这是事前方法.."+"获得事前方法的参数:"+name);
	//}

	//@AfterReturning(pointcut="anyWay()",returning="result")
	//public void doAfterReturning(String result)
	//{
	//	System.out.println("这是最终方法.."+"获得最终方法的参数:"+result);
	//}

	//@AfterThrowing(pointcut="anyWay()",throwing="e")
	//public void doAfterThrowing(Exception e)
	//{
	//	System.out.println("例外通知:"+e);
	//}


	@Around("anyWay()")
	public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//System.out.println("执行前");
		//Object o = pjp.proceed();
		//System.out.println("执行后");
		//return o;
		Object result = null;
		String methodName = proceedingJoinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());
		try
		{
			//前置通知
			System.out.println("The method [" + methodName + "] input params is " + args);
			//执行目标方法
			result = proceedingJoinPoint.proceed();
			//返回通知
			System.out.println("The method [" + methodName + "] output param is " + result);
		} catch (Throwable e)
		{
			//异常通知
			System.out.println("The method [" + methodName + "] occurs exception: " + e);
		}
		//后置通知
		System.out.println("The method [" + methodName + "] ends.");
		System.out.println(result);
		return result;
	}
}
