package com.codehuan.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangHuan created on 2022/7/11
 * @version 1.0
 * @email codehuan@163.com
 */
@RestController
public class FlowLimitController {

    // @SentinelResource("resource")
    @GetMapping("/testA")
    public String testA() {
        return "Hello---testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "Hello---testB";
    }
}
