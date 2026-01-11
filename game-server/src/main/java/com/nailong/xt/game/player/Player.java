package com.nailong.xt.game.player;

import com.nailong.xt.common.model.po.PlayerData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {
    // 验证用
    String token;

    // 绑定网关通信通道
    PlayerBindInstance playerBindInstance;

    PlayerData playerData;

    public Player() {}

}
