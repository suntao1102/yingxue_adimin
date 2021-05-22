package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */

@MapperScan("com.baizhi.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YingxueAdminVideoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(YingxueAdminVideoApplication.class, args);
    }
}
