package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡算法.
 * Program Name: microservicecloud
 * Created by yanlp on 2019-06-01
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new MyRandomRule();
    }
}
