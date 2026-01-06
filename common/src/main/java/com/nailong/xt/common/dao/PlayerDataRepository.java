package com.nailong.xt.common.dao;

import com.nailong.xt.common.model.po.PlayerData;
import com.nailong.xt.common.model.po.PlayerDataDraft;
import com.nailong.xt.common.model.po.PlayerDataTable;
import com.nailong.xt.common.model.po.Tables;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.babyfish.jimmer.sql.JSqlClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

@RequiredArgsConstructor
@Repository
@Log4j2
public class PlayerDataRepository {

    private final JSqlClient sqlClient;

    PlayerDataTable playerDataTable = Tables.PLAYER_DATA_TABLE;

    public PlayerData queryPlayerDataByUid(int playerUid) {
        return sqlClient.createQuery(playerDataTable)
                .where(playerDataTable.id().eq(playerUid))
                .select(playerDataTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerData createPlayerData() {

        PlayerData playerData = PlayerDataDraft.$.produce(dart -> dart
                .setDataVersion(0)
        );

        return savePlayerUidObj(playerData);
    }

    public PlayerData savePlayerUidObj(PlayerData playerData) {
        return (PlayerData) sqlClient.saveCommand(playerData);
    }
}
