package com.codehuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZhangHuan created on 2022/7/9
 * @version 1.0
 * @email codehuan@163.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001Application.class, args);
    }
}
