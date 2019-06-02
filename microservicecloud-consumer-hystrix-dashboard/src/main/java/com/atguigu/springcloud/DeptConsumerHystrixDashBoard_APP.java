package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Program Name: microservicecloud
 * Created by yanlp on 2019-05-27
 *
 * @author yanlp
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashBoard_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashBoard_APP.class);
    }
}
