package com.nailong.xt.game.core.player;

import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.common.model.po.PlayerDataPo;
import com.nailong.xt.game.core.player.model.Player;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerMgr {
    // key:     uid
    // value:   Player
    public static Map<Integer, Player> playerMap = new ConcurrentHashMap<>(1000);

    public static Player findPlayerByUid(Integer uid) {
        return playerMap.get(uid);
    }

    public static int getAllPlayers() {
        return playerMap.size();
    }

    // 构造器注入
    private final PlayerDataRepository playerDataRepository;

    /**
     * 这里应该专注于 playeruid
     *
     * @param uid
     * @return
     */
    public Player findAndLoadDBPlayerByUid(Integer uid) {
        if (uid == 0) return null;

        Player player = PlayerMgr.findPlayerByUid(uid);

        // 当前节点未缓存 player 要从数据库找
        if (player == null) {
            // 读数据库
            PlayerDataPo playerDataPo = playerDataRepository.queryPlayerDataByUid(uid);

            // 数据库没数据
            if (playerDataPo == null) {
                log.warn("未在数据库找到玩家数据, uid:{}", uid);
                return null;
            }

            // 从数据库加载玩家
            player = loadPlayerFromDb(playerDataPo);
        }

        playerMap.put(uid, player);
        return player;
    }

    public Player loadPlayerFromDb(PlayerDataPo playerDataPo) {
        Player player = new Player();
        player.initFromPo(playerDataPo);

        return player;
    }

    public Player createPlayer(long accountUid) {
        Player player = new Player();
        PlayerDataPo playerDataPo = playerDataRepository.queryPlayerDataByAccountId(accountUid);
        player.initFromPo(playerDataPo);

        playerMap.put(player.getUid(), player);
        return player;
    }
}
