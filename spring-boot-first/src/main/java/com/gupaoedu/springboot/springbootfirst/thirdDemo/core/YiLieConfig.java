package com.gupaoedu.springboot.springbootfirst.thirdDemo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YiLieConfig {

    @Bean
    public YiLieCore yiLieCore(){
        return new YiLieCore();
    }
}
