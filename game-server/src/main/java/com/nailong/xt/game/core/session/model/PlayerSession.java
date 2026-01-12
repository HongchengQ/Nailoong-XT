package com.nailong.xt.game.core.session.model;

import com.nailong.xt.game.core.player.model.Player;
import com.nailong.xt.game.core.player.model.PlayerBindInstance;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicLong;

@Data
public class PlayerSession {
    // 验证用
    private String token;

    // 绑定网关通信通道
    private PlayerBindInstance playerBindInstance;

    private Player player;

    private volatile boolean loggingOff = false; // 下线状态标记，防止重复触发
    private AtomicLong lastActiveTime = new AtomicLong(System.currentTimeMillis());

    public PlayerSession(int playerUid, long accountUid) {
        this.player = new Player(playerUid, accountUid);
    }

    public void updateActiveTime() {
        lastActiveTime.set(System.currentTimeMillis());
    }
    public boolean isTimeout(long timeoutMillis) {
        return System.currentTimeMillis() - lastActiveTime.get() > timeoutMillis;
    }
    public void markLoggingOff() {
        this.loggingOff = true;
    }
}
