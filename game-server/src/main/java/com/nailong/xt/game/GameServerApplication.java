package com.nailong.xt.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@ComponentScan(basePackages = {
        "com.nailong.xt.game",
        "com.nailong.xt.common.config",
        "com.nailong.xt.common.annotation",
        "com.nailong.xt.common.model.po",
        "com.nailong.xt.common.dao",
        "com.nailong.xt.common.utils",
})
@EnableScheduling
@SpringBootApplication
public class GameServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GameServerApplication.class, args);
    }
}