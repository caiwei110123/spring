package com.gupaoedu.springboot.springbootfirst.thirdDemo;

import com.gupaoedu.core.GupaoCore;
import com.gupaoedu.springboot.springbootfirst.thirdDemo.core.YiLieCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDefineService
public class EnableDemoMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca=SpringApplication.run(EnableDemoMain.class,args);
        System.out.println(ca.getBean(GupaoCore.class).study());
        System.out.println(ca.getBean(CacheService.class).cacheServiceTest());
        System.out.println(ca.getBean(LoggerService.class).loggerServiceTest());
        System.out.println(ca.getBean(YiLieCore.class));
    }
}
