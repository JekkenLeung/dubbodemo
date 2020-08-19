package com.jekken.dubbo.controller;

import com.jekken.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Jekken
 * 2020/8/18 14:42
 */
@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/say")
    public String say(){
        return userService.sayHello();
    }
}
