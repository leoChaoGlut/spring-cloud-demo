package cn.demo.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/21 23:01
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

    @GetMapping("/test")
    public String service0() {
        return "service0";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
