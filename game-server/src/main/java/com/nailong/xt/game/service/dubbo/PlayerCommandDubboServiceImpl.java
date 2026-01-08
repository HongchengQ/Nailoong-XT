package com.nailong.xt.game.service.dubbo;

import com.nailong.xt.common.config.CmdHandlerConfig;
import com.nailong.xt.common.service.PlayerCommandService;
import com.nailong.xt.game.player.Player;
import com.nailong.xt.game.player.PlayerMgr;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletableFuture;

/**
 * Dubbo服务实现，用于处理来自Gate的玩家请求
 */
@DubboService
@Log4j2
public class PlayerCommandDubboServiceImpl implements PlayerCommandService {

    @Autowired
    private CmdHandlerConfig cmdHandlerConfig;

    @Override
    public CmdRspContext handlePlayerRequest(CmdReqContext request) {
        int reqContextCmdId = request.getCmdId();
        int reqContextUid = request.getPlayerUid();
        String reqContextToken = request.getToken();

        log.info("Received Dubbo request with cmdId: {}", reqContextCmdId);

        try {
            // 获取此 cmdId 注解的方法
            CmdHandlerConfig.HandlerMethod handlerMethod = cmdHandlerConfig.getHandler(reqContextCmdId);

            if (handlerMethod == null) {
                throw new RuntimeException("没有定义的 msg id " + reqContextCmdId);
            }

            Player player = PlayerMgr.findPlayerSession(reqContextUid);

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

            return responseBuilder.build();
        } catch (Exception e) {
            log.error("Error processing Dubbo request", e);
            throw new RuntimeException("Error processing request", e);
        }
    }

    @Override
    public CompletableFuture<CmdRspContext> handlePlayerRequestAsync(CmdReqContext request) {
        return CompletableFuture.supplyAsync(() -> handlePlayerRequest(request));
    }
}