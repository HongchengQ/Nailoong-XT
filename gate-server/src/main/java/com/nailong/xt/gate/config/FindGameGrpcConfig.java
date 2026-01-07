package com.nailong.xt.gate.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "game.grpc.server")
@Getter
@Setter
public class FindGameGrpcConfig {

    private String host;

    private int port;

    @Bean
    public ManagedChannel gameServerChannel() {
        return ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext() // For development, use TLS in production
                .build();
    }
}