package com.nailong.xt.gate.controller;

import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.nailong.xt.common.config.CmdHandlerConfig;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.net.GrpcClientService;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.proto.cmd.Public;
import com.nailong.xt.proto.server.Package;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import us.hebi.quickbuf.ProtoMessage;

import java.lang.reflect.InvocationTargetException;

import static com.nailong.xt.gate.network.PlayerSessionMgr.findOrCreatePlayerSession;

@RestController
@RequestMapping("/agent-zone-global")
public class GateController {

    @Autowired
    private CmdHandlerConfig cmdHandlerConfig;

    @Autowired
    private GrpcClientService grpcClientService;

    @PostMapping
    public ResponseEntity<byte[]> handleBinaryRequest(
            @Nullable @RequestHeader("X-Token") String token,
            @RequestBody byte[] requestData)
            throws Exception
    {
        // session
        PlayerSession playerSession = findOrCreatePlayerSession(token);

        // Create request context
        CmdRequestContext packageContext = playerSession.decryptMsg(token, requestData);

        try {
            Object result;

            // 获取此 cmdId 注解的方法
            CmdHandlerConfig.HandlerMethod handlerMethod = cmdHandlerConfig.getHandler(packageContext.getCmdId());

            // gate中没有注解，代表直接转发给game即可
            if (handlerMethod == null) {
                // 发送gRPC请求到 game-server
                Package.CmdRespContext grpcResponse = grpcClientService.sendPackage(packageContext);
//                result = playerSession.encodeMsg(grpcResponse.getCmdId(), (Message) grpcResponse.getProtoData());
                result = playerSession.encodeMsg(grpcResponse.getCmdId(), grpcResponse.getProtoData());
            }
            /* 由自身 handler 处理 */
            else {
                // 提取proto数据
                ByteString protoData = packageContext.getProtoData();

                // 检查方法是否接受 CmdRequestContext 作为参数
                Class<?>[] paramTypes = handlerMethod.method().getParameterTypes();
                if (paramTypes.length > 0 && paramTypes[0] == CmdRequestContext.class) {
                    result = handlerMethod.method().invoke(handlerMethod.handler(), packageContext, playerSession);
                } else {
                    result = handlerMethod.method().invoke(handlerMethod.handler(), protoData, playerSession);
                }
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
            throw new RuntimeException("Error invoking handler for cmdId: " + packageContext.getCmdId(), e);
        }
    }
}