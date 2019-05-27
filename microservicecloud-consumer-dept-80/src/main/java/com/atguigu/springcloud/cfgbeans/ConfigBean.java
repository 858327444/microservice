package com.atguigu.springcloud.cfgbeans;

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
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
