package com.hp.web.controller;/**
 * @author: 胡鹏
 * @date: 2021/4/12 23:35
 * @description:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 胡鹏
 * @date: 2021/4/12 23:35
 * @description:
 */
@RestController
public class UserController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "test2";
    }
}
