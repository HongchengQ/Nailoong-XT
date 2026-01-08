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
import org.apache.dubbo.remoting.http12.HttpMethods;
import org.apache.dubbo.remoting.http12.rest.Mapping;
import org.apache.dubbo.rpc.stub.annotations.GRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.concurrent.CompletableFuture;

public interface ServerPushService extends org.apache.dubbo.rpc.model.DubboStub {

    String JAVA_SERVICE_NAME = "com.nailong.xt.proto.server.ServerPushService";
    String SERVICE_NAME = "com.nailong.xt.proto.server.ServerPushService";

    /**
     * <pre>
     *  保留一个单次推送的接口作为备选
     * </pre>
     */
    com.nailong.xt.proto.server.Push.NoneMessage pushSingleNotify(com.nailong.xt.proto.server.Push.PushPacketNotify request);

    CompletableFuture<com.nailong.xt.proto.server.Push.NoneMessage> pushSingleNotifyAsync(com.nailong.xt.proto.server.Push.PushPacketNotify request);

    /**
     * <pre>
     *  使用流式接口，便于Game向Gate持续推送多种消息（广播、通知等）
     * </pre>
     */
    void createPushStream(com.nailong.xt.proto.server.Push.NoneMessage request, StreamObserver<com.nailong.xt.proto.server.Push.PushPacketNotify> responseObserver);
}
