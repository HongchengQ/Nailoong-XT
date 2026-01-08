package com.nailong.xt.common.service;

import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;

import java.util.concurrent.CompletableFuture;

/**
 * 用于Gate与Game之间通信的服务接口
 */
public interface PlayerCommandService {
    /**
     * 处理玩家请求
     *
     * @param request 请求上下文
     * @return 响应上下文
     */
    CmdRspContext handlePlayerRequest(CmdReqContext request);

    /**
     * 异步处理玩家请求
     *
     * @param request 请求上下文
     * @return CompletableFuture<CmdRspContext>
     */
    CompletableFuture<CmdRspContext> handlePlayerRequestAsync(CmdReqContext request);
}