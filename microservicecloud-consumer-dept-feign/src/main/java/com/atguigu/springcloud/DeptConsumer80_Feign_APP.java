package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Program Name: microservicecloud
 * Created by yanlp on 2019-05-27
 *
 * @author yanlp
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
//@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80_Feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_APP.class);
    }
}
