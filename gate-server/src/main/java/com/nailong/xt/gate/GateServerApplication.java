package com.nailong.xt.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nailong.xt.gate", "com.nailong.xt.common.config", "com.nailong.xt.common.net"})
public class GateServerApplication {
    static void main(String[] args) {
        SpringApplication.run(GateServerApplication.class, args);
    }
}
