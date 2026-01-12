package com.nailong.xt.game.core.session;

import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.common.model.po.PlayerDataPo;
import com.nailong.xt.game.core.player.model.Player;
import com.nailong.xt.game.core.player.service.AsyncLogoutService;
import com.nailong.xt.game.core.session.model.PlayerSession;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
@RequiredArgsConstructor
public class PlayerSessionMgr implements ISessionCleanupCallback {
    // key:     uid
    // value:   Player
    public static Map<Integer, PlayerSession> playerSessionMap = new ConcurrentHashMap<>(1000);

    private static final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public static PlayerSession findPlayerByUid(Integer uid) {
        return playerSessionMap.get(uid);
    }

    public static int getAllPlayers() {
        return playerSessionMap.size();
    }

    // 构造器注入
    private final PlayerDataRepository playerDataRepository;
    private final AsyncLogoutService asyncLogoutService;

    @PostConstruct
    public void init() {
        // 定时心跳超时检查（每30秒一次）
        scheduler.scheduleAtFixedRate(this::checkHeartbeatTimeout, 30, 30, TimeUnit.SECONDS);
    }

    private void checkHeartbeatTimeout() {
        playerSessionMap.forEach((playerId, session) -> {
            // 超时时间5分钟
            if (session.isTimeout(5 * 60 * 1000) && !session.isLoggingOff()) {
                forceLogout(playerId, "心跳超时");
            }
        });
    }

    /**
     * 强制下线（超时或管理指令）
     */
    public void forceLogout(int playerUid, String reason) {
        PlayerSession session = playerSessionMap.get(playerUid);
        if (session != null && !session.isLoggingOff()) {
            session.markLoggingOff();
            log.info("玩家[{}]被强制下线，原因：{}", playerUid, reason);

            // 向 gate 通知玩家下线
//            session.getPlayerBindInstance().sendPackageAsync(Push.PushPacketNotify.newBuilder()
//                    .setCmdId(PLAYER_FORCE_LOGOUT)
//                    .addTargetPlayerUids(playerUid)
//                    .build());

            // 触发异步下线流程
            asyncLogoutService.submitLogoutTask(session, this);
        }
    }

    /**
     * 当玩家数据保存完成后，清理会话
     *
     * @param playerUid 玩家 ID
     */
    @Override
    public void onSessionCleanup(int playerUid) {
        // 这是最安全的清理点：数据已保存
        PlayerSession removed = playerSessionMap.remove(playerUid);
        if (removed != null) {
            log.info("会话清理完成: playerUid={}", playerUid);
        }
    }

    /**
     * 只查找不创建
     *
     * @param uid playerUid
     * @return 未找到时返回 null
     */
    public PlayerSession findAndLoadDBPlayerByUid(Integer uid) {
        if (uid == 0) return null;

        PlayerSession playerSession = PlayerSessionMgr.findPlayerByUid(uid);

        // 当前节点未缓存 player 要从数据库找
        if (playerSession == null) {
            // 读数据库
            PlayerDataPo playerDataPo = playerDataRepository.queryPlayerDataByUid(uid);

            // 数据库没数据
            if (playerDataPo == null) {
                log.warn("未在数据库找到玩家数据, uid:{}", uid);
                return null;
            }

            // 从数据库加载玩家
            playerSession = loadPlayerFromDb(playerDataPo);
        }

        playerSessionMap.put(uid, playerSession);
        return playerSession;
    }

    public PlayerSession loadDBPlayerByAccountUid(long accountUid) {
        if (accountUid == 0) return null;

        PlayerDataPo po = playerDataRepository.queryPlayerDataByAccountId(accountUid);

        if (po == null) return null;

        if (playerSessionMap.containsKey(po.uid())) {
            return playerSessionMap.get(po.uid());
        }

        return loadPlayerFromDb(po);
    }

    public PlayerSession loadPlayerFromDb(PlayerDataPo playerDataPo) {
        PlayerSession playerSession = new PlayerSession(playerDataPo.uid(), playerDataPo.accountUid());
        playerSession.setPlayer(Player.fromPo(playerDataPo));

        return playerSession;
    }

    public PlayerSession createPlayer(long accountUid) {
        // 从数据库创建空 player
        PlayerDataPo playerDataPo = playerDataRepository.queryOrCreatePlayerDataByAccountId(accountUid);

        // 初始化
        PlayerSession playerSession = new PlayerSession(playerDataPo.uid(), playerDataPo.accountUid());

        // 把初始化后的对象存到 db
        playerDataRepository.savePlayerDataObj(playerSession.getPlayer().toPo());

        playerSessionMap.put(playerSession.getPlayer().getUid(), playerSession);
        return playerSession;
    }
}
