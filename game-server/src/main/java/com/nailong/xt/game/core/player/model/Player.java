package com.nailong.xt.game.core.player.model;

import com.nailong.xt.common.model.po.PlayerDataPo;
import com.nailong.xt.common.model.po.PlayerDataPoDraft;
import com.nailong.xt.proto.server.BinPlayerData;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player {
    // 验证用
    String token;

    // 绑定网关通信通道
    PlayerBindInstance playerBindInstance;

    /// ////////////////////////////////
    ///
    /// 数据库映射 下面
    ///
    /// ////////////////////////////////
    int uid;
    long accountUid;

    /* 只有存库时才能修改或获取它们，正常情况下应该使用 playerBasicComp */
    @Deprecated
    Short level;
    @Deprecated
    String nickname;
    @Deprecated
    Integer exp;

    String jsonData;

    /* 这里对应 binData */
    PlayerBasicComp playerBasicComp;

    // 数据版本号，每次回写自动+1, 用来防止因回写顺序引起的回档
    Integer dataVersion;

    // 是否被弃用
    Boolean delete;

    /// ////////////////////////////////
    ///
    /// 数据库映射 上面
    ///
    /// ////////////////////////////////


    /**
     * 关于存库
     * 这个类不能被 spring扫描
     * 所以toDB要在mgr写
     * 这里只需要返回构造好的对象即可
     */
    public PlayerDataPo toPo() {
        PlayerDataPoDraft.Builder playerData = new PlayerDataPoDraft.Builder();
        playerData // 先填充基本类型
                .uid(uid)
                .accountUid(accountUid)
                .nickname(playerBasicComp.getNickname())
                .level(playerBasicComp.getLevel())
                .exp(playerBasicComp.getExp())
                .dataVersion(++dataVersion);

        // 转 binProto
        BinPlayerData.PlayerDataBin playerDataBinProto = BinPlayerData.PlayerDataBin.newBuilder()
                .setUid(uid)
                .setBasicBin(playerBasicComp.toProto())
                .build();

        // 填充 binProto
        playerData.binData(playerDataBinProto);

        return playerData.build();
    }

    public void initFromPo(PlayerDataPo po) {
        this.uid = po.uid();
        this.accountUid = po.accountUid();
        this.level = po.level();
        this.exp = po.exp();
        this.dataVersion = po.dataVersion();

        /* bin data */
        this.playerBasicComp = PlayerBasicComp.fromProto(po.binData().getBasicBin());
    }

}
