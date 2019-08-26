package com.sylar.cetc;

//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
public class CetcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CetcApplication.class, args);
    }

}
