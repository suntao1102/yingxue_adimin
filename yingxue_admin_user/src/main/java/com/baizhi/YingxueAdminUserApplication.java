package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@MapperScan("com.baizhi.dao")
@SpringBootApplication
public class YingxueAdminUserApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(YingxueAdminUserApplication.class, args);
    }
}
