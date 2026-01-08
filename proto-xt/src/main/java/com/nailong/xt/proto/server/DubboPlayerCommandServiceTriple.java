/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nailong.xt.proto.server;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.PathResolver;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.ServerService;
import org.apache.dubbo.rpc.TriRpcStatus;
import org.apache.dubbo.rpc.model.MethodDescriptor;
import org.apache.dubbo.rpc.model.ServiceDescriptor;
import org.apache.dubbo.rpc.model.StubMethodDescriptor;
import org.apache.dubbo.rpc.model.StubServiceDescriptor;
import org.apache.dubbo.rpc.service.Destroyable;
import org.apache.dubbo.rpc.stub.BiStreamMethodHandler;
import org.apache.dubbo.rpc.stub.ServerStreamMethodHandler;
import org.apache.dubbo.rpc.stub.StubInvocationUtil;
import org.apache.dubbo.rpc.stub.StubInvoker;
import org.apache.dubbo.rpc.stub.StubMethodHandler;
import org.apache.dubbo.rpc.stub.StubSuppliers;
import org.apache.dubbo.rpc.stub.UnaryStubMethodHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.concurrent.CompletableFuture;

public final class DubboPlayerCommandServiceTriple {

    public static final String SERVICE_NAME = PlayerCommandService.SERVICE_NAME;

    private static final StubServiceDescriptor serviceDescriptor = new StubServiceDescriptor(SERVICE_NAME, PlayerCommandService.class);

    static {
        org.apache.dubbo.rpc.protocol.tri.service.SchemaDescriptorRegistry.addSchemaDescriptor(SERVICE_NAME, Command.getDescriptor());
        StubSuppliers.addSupplier(SERVICE_NAME, DubboPlayerCommandServiceTriple::newStub);
        StubSuppliers.addSupplier(PlayerCommandService.JAVA_SERVICE_NAME,  DubboPlayerCommandServiceTriple::newStub);
        StubSuppliers.addDescriptor(SERVICE_NAME, serviceDescriptor);
        StubSuppliers.addDescriptor(PlayerCommandService.JAVA_SERVICE_NAME, serviceDescriptor);
    }

    @SuppressWarnings("unchecked")
    public static PlayerCommandService newStub(Invoker<?> invoker) {
        return new PlayerCommandServiceStub((Invoker<PlayerCommandService>)invoker);
    }

    private static final StubMethodDescriptor handlePlayerRequestMethod = new StubMethodDescriptor("HandlePlayerRequest",
    com.nailong.xt.proto.server.Command.CmdReqContext.class, com.nailong.xt.proto.server.Command.CmdRspContext.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((com.google.protobuf.Message) obj).toByteArray(),obj -> ((com.google.protobuf.Message) obj).toByteArray(), com.nailong.xt.proto.server.Command.CmdReqContext::parseFrom,
    com.nailong.xt.proto.server.Command.CmdRspContext::parseFrom);

    private static final StubMethodDescriptor handlePlayerRequestAsyncMethod = new StubMethodDescriptor("HandlePlayerRequest",
    com.nailong.xt.proto.server.Command.CmdReqContext.class, java.util.concurrent.CompletableFuture.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((com.google.protobuf.Message) obj).toByteArray(), obj -> ((com.google.protobuf.Message) obj).toByteArray(), com.nailong.xt.proto.server.Command.CmdReqContext::parseFrom,
    com.nailong.xt.proto.server.Command.CmdRspContext::parseFrom);

    private static final StubMethodDescriptor handlePlayerRequestProxyAsyncMethod = new StubMethodDescriptor("HandlePlayerRequestAsync",
    com.nailong.xt.proto.server.Command.CmdReqContext.class, com.nailong.xt.proto.server.Command.CmdRspContext.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((com.google.protobuf.Message) obj).toByteArray(), obj -> ((com.google.protobuf.Message) obj).toByteArray(), com.nailong.xt.proto.server.Command.CmdReqContext::parseFrom,
    com.nailong.xt.proto.server.Command.CmdRspContext::parseFrom);

    static{
        serviceDescriptor.addMethod(handlePlayerRequestMethod);
        serviceDescriptor.addMethod(handlePlayerRequestProxyAsyncMethod);
    }

    public static class PlayerCommandServiceStub implements PlayerCommandService, Destroyable {
        private final Invoker<PlayerCommandService> invoker;

        public PlayerCommandServiceStub(Invoker<PlayerCommandService> invoker) {
            this.invoker = invoker;
        }

        @Override
        public void $destroy() {
              invoker.destroy();
         }

        @Override
        public com.nailong.xt.proto.server.Command.CmdRspContext handlePlayerRequest(com.nailong.xt.proto.server.Command.CmdReqContext request){
            return StubInvocationUtil.unaryCall(invoker, handlePlayerRequestMethod, request);
        }

        public CompletableFuture<com.nailong.xt.proto.server.Command.CmdRspContext> handlePlayerRequestAsync(com.nailong.xt.proto.server.Command.CmdReqContext request){
            return StubInvocationUtil.unaryCall(invoker, handlePlayerRequestAsyncMethod, request);
        }

        public void handlePlayerRequest(com.nailong.xt.proto.server.Command.CmdReqContext request, StreamObserver<com.nailong.xt.proto.server.Command.CmdRspContext> responseObserver){
            StubInvocationUtil.unaryCall(invoker, handlePlayerRequestMethod , request, responseObserver);
        }
    }

    public static abstract class PlayerCommandServiceImplBase implements PlayerCommandService, ServerService<PlayerCommandService> {
        private <T, R> BiConsumer<T, StreamObserver<R>> syncToAsync(java.util.function.Function<T, R> syncFun) {
            return new BiConsumer<T, StreamObserver<R>>() {
                @Override
                public void accept(T t, StreamObserver<R> observer) {
                    try {
                        R ret = syncFun.apply(t);
                        observer.onNext(ret);
                        observer.onCompleted();
                    } catch (Throwable e) {
                        observer.onError(e);
                    }
                }
            };
        }

        @Override
        public CompletableFuture<com.nailong.xt.proto.server.Command.CmdRspContext> handlePlayerRequestAsync(com.nailong.xt.proto.server.Command.CmdReqContext request){
                return CompletableFuture.completedFuture(handlePlayerRequest(request));
        }

        // This server stream type unary method is <b>only</b> used for generated stub to support async unary method.
        // It will not be called if you are NOT using Dubbo3 generated triple stub and <b>DO NOT</b> implement this method.

        public void handlePlayerRequest(com.nailong.xt.proto.server.Command.CmdReqContext request, StreamObserver<com.nailong.xt.proto.server.Command.CmdRspContext> responseObserver){
            handlePlayerRequestAsync(request).whenComplete((r, t) -> {
                if (t != null) {
                    responseObserver.onError(t);
                } else {
                    responseObserver.onNext(r);
                    responseObserver.onCompleted();
                }
            });
        }

        @Override
        public final Invoker<PlayerCommandService> getInvoker(URL url) {
            PathResolver pathResolver = url.getOrDefaultFrameworkModel()
            .getExtensionLoader(PathResolver.class)
            .getDefaultExtension();
            Map<String, StubMethodHandler<?, ?>> handlers = new HashMap<>();
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/HandlePlayerRequest");
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/HandlePlayerRequestAsync");
            // for compatibility
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/HandlePlayerRequest");
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/HandlePlayerRequestAsync");
            BiConsumer<com.nailong.xt.proto.server.Command.CmdReqContext, StreamObserver<com.nailong.xt.proto.server.Command.CmdRspContext>> handlePlayerRequestFunc = this::handlePlayerRequest;
            handlers.put(handlePlayerRequestMethod.getMethodName(), new UnaryStubMethodHandler<>(handlePlayerRequestFunc));
            BiConsumer<com.nailong.xt.proto.server.Command.CmdReqContext, StreamObserver<com.nailong.xt.proto.server.Command.CmdRspContext>> handlePlayerRequestAsyncFunc = syncToAsync(this::handlePlayerRequest);
            handlers.put(handlePlayerRequestProxyAsyncMethod.getMethodName(), new UnaryStubMethodHandler<>(handlePlayerRequestAsyncFunc));

            return new StubInvoker<>(this, url, PlayerCommandService.class, handlers);
        }

        @Override
        public com.nailong.xt.proto.server.Command.CmdRspContext handlePlayerRequest(com.nailong.xt.proto.server.Command.CmdReqContext request){
            throw unimplementedMethodException(handlePlayerRequestMethod);
        }

        @Override
        public final ServiceDescriptor getServiceDescriptor() {
            return serviceDescriptor;
        }
        private RpcException unimplementedMethodException(StubMethodDescriptor methodDescriptor) {
            return TriRpcStatus.UNIMPLEMENTED.withDescription(String.format("Method %s is unimplemented",
                "/" + serviceDescriptor.getInterfaceName() + "/" + methodDescriptor.getMethodName())).asException();
        }
    }
}
