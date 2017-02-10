package cn.demo.service1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 12:28
 * @Description:
 */
@FeignClient("service0")
public interface Service0Client {

    @RequestMapping(method = RequestMethod.GET, path = "test")
    String test();

}
