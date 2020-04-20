package com.yd.xxian.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName BackstageStartApplication
 * @Description TODO
 * @Author Yaoson
 * @Date 2020-04-20 23:37
 * @Version 1.0
 **/
@SpringBootApplication
@ComponentScan(basePackages={"com.yd.xxian"})
@EnableTransactionManagement
public class BackstageStartApplication extends SpringBootServletInitializer {

    // 打war包部署到外部Tomcat配置
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BackstageStartApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BackstageStartApplication.class, args);
    }

}
