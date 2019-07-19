package com.learn.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zack.zhang
 * @projectName learn-cloud-zuul
 * @title ZuulApplication
 * @package com.learn.cloud.zuul
 * @description 启动类
 * @date 2019-07-19 11:44
 */
@SpringBootApplication
@EnableZuulProxy //支持网关路由。
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
