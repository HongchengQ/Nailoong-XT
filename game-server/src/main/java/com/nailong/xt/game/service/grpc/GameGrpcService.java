package com.nailong.xt.game.service.grpc;

import com.nailong.xt.common.config.CmdHandlerConfig;
import com.nailong.xt.game.player.Player;
import com.nailong.xt.game.player.PlayerMgr;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import com.nailong.xt.proto.server.PlayerCommandServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.util.ObjectUtils;

/**
 * 接收 gate 传来的客户端数据包上下文
 * 回复用户数据包
 */
@GrpcService
@Log4j2
@RequiredArgsConstructor
public class GameGrpcService extends PlayerCommandServiceGrpc.PlayerCommandServiceImplBase {

    private final CmdHandlerConfig cmdHandlerConfig;

    @Override
    public void handlePlayerRequest(CmdReqContext request, StreamObserver<CmdRspContext> responseObserver) {
        int reqContextCmdId = request.getCmdId();
        int reqContextUid = request.getPlayerUid();
        String reqContextToken = request.getToken();

        log.info("Received gRPC request with cmdId: {}", reqContextCmdId);

        try {
            // 获取此 cmdId 注解的方法
            CmdHandlerConfig.HandlerMethod handlerMethod = cmdHandlerConfig.getHandler(reqContextCmdId);

            if (handlerMethod == null) {
                throw new RuntimeException("没有定义的 msg id " + reqContextCmdId);
            }

            Player player = PlayerMgr.findPlayerByUid(reqContextUid);

            if (player != null) {
                // 初始化 token
                // token 由 gate 填充
                if (!ObjectUtils.isEmpty(reqContextToken) && player.getToken() == null) {
                    player.setToken(reqContextToken);
                }
            }

            // 先构建 rsp 模板
            CmdRspContext.Builder responseBuilder = CmdRspContext.newBuilder()
                    .setTimestamp(System.currentTimeMillis())
                    .setToken(reqContextToken)
                    .setReqCmdId(reqContextCmdId);

            // 处理方法
            // 将 (reqContext + 预构建的rspContext + player) 引用传递
            handlerMethod.method().invoke(handlerMethod.handler(), request, responseBuilder, player);

            CmdRspContext response = responseBuilder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            log.error("Error processing gRPC request", e);
            responseObserver.onError(e);
        }
    }
}