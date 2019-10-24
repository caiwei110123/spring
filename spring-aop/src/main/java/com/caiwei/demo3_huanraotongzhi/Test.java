package com.caiwei.demo3_huanraotongzhi;

import com.caiwei.demo2.Animal;
import com.caiwei.demo2.AnimalConfig;
import com.caiwei.demo2.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		//IUserDao dao = (IUserDao)context.getBean("userDao");
		//dao.save("123");
		//dao.update();
		//dao.doThrow();
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserDaoAnimalConfig.class);

		IUserDao dao = applicationContext.getBean("userDaoImpl", UserDaoImpl.class);
		dao.save("123");
	}

}
