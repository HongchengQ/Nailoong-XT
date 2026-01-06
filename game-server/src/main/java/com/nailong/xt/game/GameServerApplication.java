package com.nailong.xt.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.nailong.xt.game",
        "com.nailong.xt.common.config",
//        "com.nailong.xt.common.net",
        "com.nailong.xt.common.po",
        "com.nailong.xt.common.dao"
})
public class GameServerApplication {
    static void main(String[] args) {
        SpringApplication.run(GameServerApplication.class, args);
    }
}
