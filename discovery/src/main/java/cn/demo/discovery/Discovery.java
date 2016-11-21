package cn.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/21 22:49
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Discovery {
    public static void main(String[] args) {
        SpringApplication.run(Discovery.class, args);
    }
}
