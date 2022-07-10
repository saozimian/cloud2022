package com.codehuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangHuan created on 2022/7/10
 * @version 1.0
 * @email codehuan@163.com
 */
@Configuration
public class LoadBalancerConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
