package com.example;

import com.example.transaction.ContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@MapperScan("com.example.mapper") //扫描的mapper
@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
			SpringApplication.run(DemoApplication.class, args);
		ContextUtils.setApplicationContext(context);
		try {
			System.out.println("[============="+context.getBean(DataSource.class).getConnection().toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
