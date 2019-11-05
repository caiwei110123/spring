package com.caiwei.demo3_huanraotongzhi;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan
@Service
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class UserDaoAnimalConfig {
}