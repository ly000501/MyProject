package com.xinzhiyun.universitysciencesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务
@EnableTransactionManagement
//扫描注解包
@ComponentScan("com.xinzhiyun.universitysciencesys.controller")
@ComponentScan("com.xinzhiyun.universitysciencesys.service")
@ComponentScan("com.xinzhiyun.universitysciencesys.dao")
//扫描映射文件包
@MapperScan("com.xinzhiyun.universitysciencesys.dao")
public class UniversityScienceSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityScienceSysApplication.class, args);
    }

}
