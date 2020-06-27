package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@EnableConfigurationProperties(value = { DbOne.class, DbTwo.class })
@EnableTransactionManagement
@SpringBootApplication
public class MktApplication {

    public static void main(String[] args) {
        SpringApplication.run(MktApplication.class, args);
    }

}
