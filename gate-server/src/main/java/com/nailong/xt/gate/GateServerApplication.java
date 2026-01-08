package com.nailong.xt.gate;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {
        "com.nailong.xt.gate",
        "com.nailong.xt.common.config",
        "com.nailong.xt.common.annotation",
        "com.nailong.xt.common.po",
        "com.nailong.xt.common.dao"
})
@SpringBootApplication
@EnableDubbo
public class GateServerApplication {
    static void main(String[] args) {
        SpringApplication.run(GateServerApplication.class, args);
    }
}
