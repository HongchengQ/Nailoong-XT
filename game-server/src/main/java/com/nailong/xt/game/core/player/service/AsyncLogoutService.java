package com.nailong.xt.game.core.player.service;

import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.game.core.session.ISessionCleanupCallback;
import com.nailong.xt.game.core.session.model.PlayerSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
@RequiredArgsConstructor
public class AsyncLogoutService {
    // 使用一个专门的线程池处理下线任务，避免阻塞业务线程
    private final ExecutorService logoutExecutor = Executors.newFixedThreadPool(2);

    private final PlayerDataRepository playerDataRepository;

    public void submitLogoutTask(PlayerSession session, ISessionCleanupCallback callback) {
        logoutExecutor.submit(() -> {
            try {
                // 调用保存服务
                playerDataRepository.savePlayerDataObj(session.getPlayer().toPo());
                // 清理总列表
                callback.onSessionCleanup(session.getPlayer().getUid());
            } catch (Exception e) {
                log.error("玩家下线任务异常", e);
            }
        });
    }
}