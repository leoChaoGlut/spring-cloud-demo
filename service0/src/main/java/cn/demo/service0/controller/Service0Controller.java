package cn.demo.service0.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 12:13
 * @Description:
 */
@RestController
public class Service0Controller {

    @GetMapping("test")
    String test() {
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }

}
