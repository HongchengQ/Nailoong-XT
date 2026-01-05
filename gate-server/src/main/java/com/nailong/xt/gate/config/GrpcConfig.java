package com.nailong.xt.gate.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.grpc.client.GrpcChannelFactory;

@Configuration
public class GrpcConfig {

    @Value("${game.grpc.server.host:localhost}")
    private String gameServerHost;

    @Value("${game.grpc.server.port:9090}")
    private int gameServerPort;

    @Bean
    public ManagedChannel gameServerChannel() {
        return ManagedChannelBuilder
                .forAddress(gameServerHost, gameServerPort)
                .usePlaintext() // For development, use TLS in production
                .build();
    }
}