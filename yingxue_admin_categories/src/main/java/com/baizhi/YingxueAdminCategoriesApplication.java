package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class YingxueAdminCategoriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(YingxueAdminCategoriesApplication.class, args);
    }

}
