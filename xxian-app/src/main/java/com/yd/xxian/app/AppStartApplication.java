package com.yd.xxian.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName AppStartApplication
 * @Description TODO
 * @Author Yaoson
 * @Date 2020-04-20 23:05
 * @Version 1.0
 **/

@SpringBootApplication
@ComponentScan("com.yd.xxian")
@EnableTransactionManagement
@EnableScheduling
public class AppStartApplication extends SpringBootServletInitializer {

    // 打war包部署到外部Tomcat配置
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppStartApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppStartApplication.class, args);
    }

}
