package com.codehuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangHuan created on 2022/7/9
 * @version 1.0
 * @email codehuan@163.com
 */
@RestController
public class EchoController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string + ",serverPort:" + serverPort;
    }
}
