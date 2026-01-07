package com.nailong.xt.game.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "gate.grpc.server")
@Getter
@Setter
public class FindGateGrpcConfig {
    private String host;

    private int port;

    @Bean
    public ManagedChannel gateServerChannel() {
        return ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext() // For development, use TLS in production
                .build();
    }
}