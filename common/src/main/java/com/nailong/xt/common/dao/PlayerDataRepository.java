package com.nailong.xt.common.dao;

import com.nailong.xt.common.model.po.PlayerDataPo;
import com.nailong.xt.common.model.po.PlayerDataPoDraft;
import com.nailong.xt.common.model.po.PlayerDataPoTable;
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

    PlayerDataPoTable playerDataTable = Tables.PLAYER_DATA_PO_TABLE;

    public PlayerDataPo queryPlayerDataByUid(int playerUid) {
        return sqlClient.createQuery(playerDataTable)
                .where(playerDataTable.uid().eq(playerUid))
                .select(playerDataTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerDataPo queryPlayerDataByAccountId(long accountUid) {
        return sqlClient.createQuery(playerDataTable)
                .where(playerDataTable.accountUid().eq(accountUid))
                .select(playerDataTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public PlayerDataPo queryOrCreatePlayerDataByAccountId(long accountUid) {
        PlayerDataPo data;
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

    public PlayerDataPo createPlayerData(long accountUid) {
        PlayerDataPo playerDataPo = new PlayerDataPoDraft.Builder()
                .accountUid(accountUid)
                .dataVersion(0)
                .build();

        log.info("新号创建中 {}", playerDataPo);

        return savePlayerDataObj(playerDataPo);
    }

    /**
     * 保存 PlayerData 对象到数据库
     *
     * @param playerDataPo 如果是凭空创建需要指定 DataVersion
     * @return ModifiedEntity
     */
    public PlayerDataPo savePlayerDataObj(PlayerDataPo playerDataPo) {
        return sqlClient
                .saveCommand(playerDataPo)
                .execute()
                .getModifiedEntity();
    }
}
