package com.nailong.xt.common.dao;

import com.nailong.xt.common.model.po.PlayerData;
import com.nailong.xt.common.model.po.PlayerDataDraft;
import com.nailong.xt.common.model.po.PlayerDataTable;
import com.nailong.xt.common.model.po.Tables;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.babyfish.jimmer.sql.JSqlClient;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Log4j2
public class PlayerDataRepository {

    private final JSqlClient sqlClient;

    PlayerDataTable playerDataTable = Tables.PLAYER_DATA_TABLE;

    public PlayerData queryPlayerDataByUid(int playerUid) {
        return sqlClient.createQuery(playerDataTable)
                .where(playerDataTable.uid().eq(playerUid))
                .select(playerDataTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerData queryPlayerDataByAccountId(long accountUid) {
        return sqlClient.createQuery(playerDataTable)
                .where(playerDataTable.accountUid().eq(accountUid))
                .select(playerDataTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerData queryOrCreatePlayerDataByAccountId(long accountUid) {
        PlayerData data;
        try {
            data = queryPlayerDataByAccountId(accountUid);
        } catch (Exception e) {
            data = null;
        }

        if (data == null) {
            log.info("新号创建，account uid {}", accountUid);
            return createPlayerData(accountUid);
        }

        log.info("老号登录，account uid {}", data);
        return data;
    }

    public PlayerData createPlayerData(long accountUid) {
        PlayerData playerData = new PlayerDataDraft.Builder()
                .accountUid(accountUid)
                .build();

        log.info("新号创建中 {}", playerData);

        return savePlayerDataObj(playerData);
    }

    public PlayerData savePlayerDataObj(PlayerData playerData) {
        return sqlClient
                .saveCommand(playerData)
                .execute()
                .getModifiedEntity();
    }
}
