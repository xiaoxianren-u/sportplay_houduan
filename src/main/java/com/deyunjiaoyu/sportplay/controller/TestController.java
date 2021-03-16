package com.deyunjiaoyu.sportplay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Email: 1793925141@qq.com
 * @Author: yangzhan
 * @Tiem: 2021/3/3 14:16 星期三
 * @Software: IntelliJ IDEA
 * @File : LoginController.JAVA
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
