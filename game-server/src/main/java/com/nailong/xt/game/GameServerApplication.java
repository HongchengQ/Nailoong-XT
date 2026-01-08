package com.nailong.xt.game;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {
        "com.nailong.xt.game",
        "com.nailong.xt.common.config",
        "com.nailong.xt.common.annotation",
        "com.nailong.xt.common.po",
        "com.nailong.xt.common.dao"
})
@SpringBootApplication
@EnableDubbo
public class GameServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GameServerApplication.class, args);
    }
}