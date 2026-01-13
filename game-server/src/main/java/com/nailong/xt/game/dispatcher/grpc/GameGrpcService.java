package com.nailong.xt.game.dispatcher.grpc;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.config.CmdHandlerConfig;
import com.nailong.xt.game.core.session.PlayerSessionMgr;
import com.nailong.xt.game.core.session.model.PlayerSession;
import com.nailong.xt.proto.cmd.Public;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import com.nailong.xt.proto.server.PlayerCommandServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

import static com.nailong.xt.common.constants.GamePlayerCmdIdConstants.sudo_failed_ack;

/**
 * 接收 gate 传来的客户端数据包上下文
 * 回复用户数据包
 */
@GrpcService
@Log4j2
@RequiredArgsConstructor
public class GameGrpcService extends PlayerCommandServiceGrpc.PlayerCommandServiceImplBase {

    private final CmdHandlerConfig cmdHandlerConfig;

    private final PlayerSessionMgr playerSessionMgr;

    @Override
    public void handlePlayerRequest(CmdReqContext request, StreamObserver<CmdRspContext> responseObserver) {
        int reqContextCmdId = request.getCmdId();
        int reqContextUid = request.getPlayerUid();
        long reqContextAccountId = request.getAccountUid();
        String reqContextToken = request.getToken();
        String gateServerAddress = request.getGateServerAddress();

        // 先构建 rsp 模板
        CmdRspContext.Builder responseBuilder = CmdRspContext.newBuilder()
                .setTimestamp(System.currentTimeMillis())
                .setToken(reqContextToken)
                .setReqCmdId(reqContextCmdId);

        log.info("Received gRPC request with cmdId: {}", reqContextCmdId);

        try {
            // 获取此 cmdId 注解的方法
            CmdHandlerConfig.HandlerMethod handlerMethod = cmdHandlerConfig.getHandler(reqContextCmdId);

            if (handlerMethod == null) {
                log.error("没有定义的 msgId:{}, uid:{} accountId:{}", reqContextCmdId, reqContextUid, reqContextAccountId);
                CmdRspContext response = responseBuilder
                        .setCmdId(sudo_failed_ack)
                        .setProtoData(ByteString.copyFrom(Public.Error.newInstance().setCode(100103).toByteArray())) // 消息命令号无效
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                return;
            }

            PlayerSession playerSession = playerSessionMgr.findAndLoadDBPlayerByUid(reqContextUid);


            if (playerSession != null) {
                // 初始化 token
                // token 由 gate 填充
                if (!ObjectUtils.isEmpty(reqContextToken) && playerSession.getToken() == null) {
                    playerSession.setToken(reqContextToken);
                }

                // 检查并更新 gate地址
                if (playerSession.getPlayerBindInstance() != null) {
                    if (!ObjectUtils.isEmpty(gateServerAddress) && !Objects.equals(playerSession.getPlayerBindInstance().getGateServerAddress(), gateServerAddress)) {
                        playerSession.getPlayerBindInstance().setBindInstance(gateServerAddress);
                    }
                }

                playerSession.updateActiveTime();
            }

            // 处理方法
            // 将 (reqContext + 预构建的rspContext + player) 引用传递
            handlerMethod.method().invoke(handlerMethod.handler(), request, responseBuilder, playerSession);

            // rsp uid
            if (responseBuilder.getPlayerUid() == 0 && playerSession != null && playerSession.getPlayer() != null) {
                responseBuilder.setPlayerUid(playerSession.getPlayer().getUid());
            }

            CmdRspContext response = responseBuilder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            log.info("Send gRPC response with cmdId: {}", responseBuilder.getCmdId());
        } catch (Exception e) {
            log.error("Error processing gRPC request", e);
            responseObserver.onError(e);
        }
    }
}