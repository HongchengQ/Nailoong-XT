package com.nailong.xt.common.utils;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public final class RpcUtils {
    public static ManagedChannel generateGrpcManagedChannel(String Target ) {
        return ManagedChannelBuilder
                .forTarget(Target)
                .usePlaintext() // dev
                .build();
    }
}
