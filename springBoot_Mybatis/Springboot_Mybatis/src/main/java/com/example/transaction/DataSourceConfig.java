package com.example.transaction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/26  上午1:32
 * @Version 1.0
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    @Qualifier("dataSource")
    @ConfigurationProperties
    public DataSource getMyDataSource(){
        return DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver").password("cai000wei").username("root").
            url("jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC").build();
    }

}