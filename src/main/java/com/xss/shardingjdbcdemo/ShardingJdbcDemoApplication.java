package com.xss.shardingjdbcdemo;

import lombok.Lombok;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
@MapperScan("com.xss.shardingjdbcdemo.mapper")
public class ShardingJdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDemoApplication.class, args);
    }
}
