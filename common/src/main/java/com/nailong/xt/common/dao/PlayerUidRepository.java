package com.nailong.xt.common.dao;

import com.nailong.xt.common.model.po.PlayerUid;
import com.nailong.xt.common.model.po.PlayerUidDraft;
import com.nailong.xt.common.model.po.PlayerUidTable;
import com.nailong.xt.common.model.po.Tables;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.babyfish.jimmer.sql.JSqlClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

@RequiredArgsConstructor
@Repository
@Log4j2
public class PlayerUidRepository {

    private final JSqlClient sqlClient;

    PlayerUidTable playerUidTable = Tables.PLAYER_UID_TABLE;

    public PlayerUid queryPlayerUidByUid(int playerUid) {
        return sqlClient.createQuery(playerUidTable)
                .where(playerUidTable.id().eq(playerUid))
                .select(playerUidTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerUid queryPlayerUidByAccountId(long accountUid) {
        try {
            return sqlClient.createQuery(playerUidTable)
                    .where(playerUidTable.accountUid().eq(accountUid))
                    .select(playerUidTable)
                    .execute()
                    .stream()
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            return null;
        }

    }

    public PlayerUid createPlayerUid(int playerUid, long accountUid) {
        if (ObjectUtils.isEmpty(playerUid) || ObjectUtils.isEmpty(accountUid)) {
            log.error("参数错误 openId 为空");
            return null;
        }

        PlayerUid playerUidObj = queryPlayerUidByUid(playerUid);
        if (playerUidObj != null) {
            log.warn("无法创建 User 对象，因为它已经存在过了，id: {}，向上层返回 null", playerUid);
            return null;
        }

        playerUidObj = PlayerUidDraft.$.produce(dart -> dart
                .setId(playerUid)
                .setAccountUid(accountUid)
                .setAccountType(0)
        );

        return savePlayerUidObj(playerUidObj);
    }

    public PlayerUid savePlayerUidObj(PlayerUid obj) {
        return (PlayerUid) sqlClient.saveCommand(obj);
    }
}
