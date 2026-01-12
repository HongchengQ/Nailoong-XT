package com.nailong.xt.game.core.session;

public interface ISessionCleanupCallback {
    /**
     * 当玩家数据保存完成后，清理会话
     * @param playerUid 玩家 Uid
     */
    void onSessionCleanup(int playerUid);
}
