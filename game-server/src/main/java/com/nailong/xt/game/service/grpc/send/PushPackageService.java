package com.nailong.xt.game.service.grpc.send;

import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.Push.PushPacketNotify;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * Game Server to Gate Server 消息服务
 * 提供game server向gate server主动发送消息的功能
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class PushPackageService {

    /// ////////////////////////////////////////////////////////////
    private final ManagedChannel gateServerChannel;

    public CompletableFuture<Empty> sendPackageAsync(Push.PushPacketNotify request) {
        return CompletableFuture.supplyAsync(() -> {
            ServerPushServiceGrpc.ServerPushServiceBlockingStub stub =
                    ServerPushServiceGrpc.newBlockingStub(gateServerChannel);
            return stub.pushSingleNotify(request);
        });
    }

    public Empty sendPackage(Push.PushPacketNotify request) {
        ServerPushServiceGrpc.ServerPushServiceBlockingStub stub =
                ServerPushServiceGrpc.newBlockingStub(gateServerChannel);
        return stub.pushSingleNotify(request);
    }
    /// ////////////////////////////////////////////////////////////

    /**
     * 向gate server发送消息
     *
     * @param cmdId     消息ID
     * @param token     会话token
     * @param playerUid 玩家ID
     * @param protoData 消息数据
     * @return 响应上下文
     */
    public void sendMessageToGate(int cmdId, String token, int playerUid, ByteString protoData) {
        try {
            // 构建请求上下文
            PushPacketNotify notify = PushPacketNotify.newBuilder()
                    .setCmdId(cmdId)
                    .setToken(token)
                    .addTargetPlayerUids(playerUid)
                    .setProtoData(protoData)
                    .setTimestamp(System.currentTimeMillis())
                    .build();

            log.info("Sending message to gate server with cmdId: {}, playerUid: {}", cmdId, playerUid);

            // 发送消息到gate server
            sendPackage(notify);
        } catch (Exception e) {
            log.error("Error sending message to gate server", e);
            throw e;
        }
    }

    /**
     * 异步向gate server发送消息
     *
     * @param cmdId     消息ID
     * @param token     会话token
     * @param playerUid 玩家ID
     * @param protoData 消息数据
     */
    public void sendMessageToGateAsync(int cmdId, String token, int playerUid, ByteString protoData) {
        try {
            // 构建请求上下文
            PushPacketNotify notify = PushPacketNotify.newBuilder()
                    .setCmdId(cmdId)
                    .setToken(token)
                    .addTargetPlayerUids(playerUid)
                    .setProtoData(protoData)
                    .setTimestamp(System.currentTimeMillis())
                    .build();

            log.info("Sending message to gate server asynchronously with cmdId: {}, playerUid: {}", cmdId, playerUid);

            // 异步发送消息到gate server
            sendPackageAsync(notify)
                    .exceptionally(throwable -> {
                        log.error("Error sending message to gate server asynchronously", throwable);
                        return null;
                    });
        } catch (Exception e) {
            log.error("Error preparing async message to gate server", e);
            throw e;
        }
    }

    /**
     * 发送玩家通知消息到gate server
     *
     * @param notificationCmdId 通知消息ID (例如: NetMsgIdConstants.player_new_notify)
     * @param token             会话token
     * @param playerUid         玩家ID
     * @param notificationData  通知数据
     */
    public void sendPlayerNotification(int notificationCmdId, String token, int playerUid, ByteString notificationData) {
        sendMessageToGateAsync(notificationCmdId, token, playerUid, notificationData);
    }

    /**
     * 发送系统通知到gate server
     *
     * @param systemCmdId 系统消息ID
     * @param token       会话token
     * @param playerUid   玩家ID
     * @param systemData  系统数据
     */
    public void sendSystemNotification(int systemCmdId, String token, int playerUid, ByteString systemData) {
        sendMessageToGateAsync(systemCmdId, token, playerUid, systemData);
    }
}