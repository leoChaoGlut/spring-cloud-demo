package cn.demo.service1.controller;

import cn.demo.service1.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 14:21
 * @Description:
 */
@RestController
public class Service1Controller {

    @Autowired
    Service0Client service0Client;

    @GetMapping("/test")
    public String test() {
        return service0Client.test();
    }

}
