package com.jekken.dubbo.service.impl;

import com.jekken.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Create by Jekken
 * 2020/8/18 11:24
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Value("${server.port}")
    private String port;


    @Override
    public String sayHello() {
        return "port "+port+":hello";
    }
}
