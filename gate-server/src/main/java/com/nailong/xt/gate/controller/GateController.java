package com.nailong.xt.gate.controller;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.config.CmdHandlerConfig;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.gate.network.PlayerSessionMgr;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.Nullable;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

import static com.nailong.xt.common.utils.Utils.bytesToHex;

@RestController
@RequestMapping("/agent-zone-global")
@RequiredArgsConstructor
@Slf4j
public class GateController {

    private final CmdHandlerConfig cmdHandlerConfig;

    private final PlayerSessionMgr playerSessionMgr;

    private final Environment environment;

    @PostMapping
    public ResponseEntity<byte[]> handleBinaryRequest(
            @Nullable @RequestHeader("X-Token") String token,
            @RequestBody byte[] requestData)
            throws Exception {
        // session
        PlayerSession playerSession = playerSessionMgr.findOrCreatePlayerSession(token);

        // 解码请求
        // Create request context
        CmdReqContext reqPackageContext = playerSession.decryptMsg(token, requestData)
                .setGateServerAddress(environment.getProperty("spring.grpc.server.address")) // 附加 gate 的 grpc 地址
                .build();

        Object result;
        try {
            // 提取 proto 数据
            ByteString reqProtoData = reqPackageContext.getProtoData();

            log.info("客户端请求上下文 ->\n{}", reqPackageContext);

            // 获取此 cmdId 注解的方法
            CmdHandlerConfig.HandlerMethod serviceMethod = cmdHandlerConfig.getHandler(reqPackageContext.getCmdId());

            if (serviceMethod == null) {
                /* gate中没有注解，代表直接转发给game即可 */

                // 发送gRPC请求到 game-server
                CmdRspContext grpcResponse = playerSession.getPlayerBindInstance().sendPackage(reqPackageContext);
                result = playerSession.encodeMsg(grpcResponse.getCmdId(), grpcResponse.getProtoData());

                log.info("game server 响应上下文 ->\ncmdId:{}\nmessage:{}\nreq_cmd_id:{}\ntoken:{}\nplayer_uid:{}\ntimestamp:{}\nis_failed:{}",
                        grpcResponse.getCmdId(),
                        bytesToHex(grpcResponse.getProtoData().toByteArray()),
                        grpcResponse.getReqCmdId(),
                        grpcResponse.getToken(),
                        grpcResponse.getPlayerUid(),
                        grpcResponse.getTimestamp(),
                        grpcResponse.getIsFailed()
                );
            } else {
                /* 由自身 handler 处理 */
                Class<?>[] paramTypes = serviceMethod.method().getParameterTypes(); // 检查方法是否接受 CmdRequestContext 作为参数
                if (paramTypes.length > 0 && paramTypes[0] == CmdReqContext.class) {
                    result = serviceMethod.method().invoke(serviceMethod.handler(), reqPackageContext, playerSession);
                } else {
                    result = serviceMethod.method().invoke(serviceMethod.handler(), reqProtoData, playerSession);
                }

                log.info("gate server 已响应 ->\nmessage:{}", Utils.bytesToHex((byte[]) result));
            }

            if (result instanceof byte[] bytesResult) {
                return ResponseEntity.ok()
                        .header("Server", "agent")
                        .body(playerSession.encryptPacketData(bytesResult));
            } else {
                // 如果结果不是字节数组，则返回空响应
                return ResponseEntity.ok(new byte[0]);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Error invoking handler for cmdId: " + reqPackageContext.getCmdId(), e);
        }
    }
}