package com.nailong.xt.game.player;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerMgr {
    // key:     uid
    // value:   Player
    public static Map<Integer, Player> playerMap = new ConcurrentHashMap<>(1000);

    public static Player findPlayerSession(Integer uid) {
        return playerMap.get(uid);
    }
}
