package com.ecreditpal.zoo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lifeng
 * @version 1.0 on 2018/6/6.
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ServerApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);

    }
}
