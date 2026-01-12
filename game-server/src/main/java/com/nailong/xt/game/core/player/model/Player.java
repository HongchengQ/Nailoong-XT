package com.nailong.xt.game.core.player.model;

import com.nailong.xt.common.model.po.PlayerDataPo;
import com.nailong.xt.common.model.po.PlayerDataPoDraft;
import com.nailong.xt.proto.server.BinPlayerData;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player {
    private int uid;
    private long accountUid;

    /* 只有存库时才能修改或获取它们，正常情况下应该使用 playerBasicComp */
    @Deprecated
    private Short level;
    @Deprecated
    private String nickname;
    @Deprecated
    private Integer exp;

    private String jsonData;

    /* 这里对应 binData */
    private PlayerBasicComp playerBasicComp;

    // 数据版本号，每次回写自动+1, 用来防止因回写顺序引起的回档
    private Integer dataVersion;

    // 是否被弃用
    private Boolean delete;

    public Player(int uid, long accountUid) {
        this.uid = uid;
        this.accountUid = accountUid;
        this.level = 0;
        this.exp =0;
        this.dataVersion = 0;

        /* bin data */
        this.playerBasicComp = new PlayerBasicComp();
    }

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
                .dataVersion(dataVersion);

        // 转 binProto
        BinPlayerData.PlayerDataBin playerDataBinProto = BinPlayerData.PlayerDataBin.newBuilder()
                .setUid(uid)
                .setBasicBin(playerBasicComp.toProto())
                .build();

        // 填充 binProto
        playerData.binData(playerDataBinProto);

        return playerData.build();
    }

    public static Player fromPo(PlayerDataPo po) {
        Player player = new Player();

        player.uid = po.uid();
        player.accountUid = po.accountUid();
        player.level = po.level();
        player.exp = po.exp();
        player.dataVersion = po.dataVersion();

        /* bin data */
        player.playerBasicComp = PlayerBasicComp.fromProto(po.binData().getBasicBin());

        return player;
    }
}
