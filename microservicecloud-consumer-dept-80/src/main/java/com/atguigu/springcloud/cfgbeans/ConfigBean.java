package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Program Name: microservicecloud
 * Created by yanlp on 2019-05-27
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
public class ConfigBean {//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml

    @Bean
    @LoadBalanced // SpringCloud Ribbon是基于Netfix Ribbon实现的一套客户端,负载均衡的工具
    public RestTemplate getRestTemplates() {
        return new RestTemplate();
    }
}
