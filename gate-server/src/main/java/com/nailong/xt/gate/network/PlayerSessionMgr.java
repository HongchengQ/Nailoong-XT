package com.nailong.xt.gate.network;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Slf4j
@ToString
public class PlayerSessionMgr {
    // key:     token
    // value:   session
    public static Map<String, PlayerSession> playerSessionMap = new ConcurrentHashMap<>(1000);

    public static PlayerSession findPlayerSession(String token) {
        return playerSessionMap.get(token);
    }

    public static PlayerSession findOrCreatePlayerSession(String token) {
        if (ObjectUtils.isEmpty(token)) {
            return new PlayerSession();
        }

        PlayerSession session;

        log.info(playerSessionMap.toString());

        session = findPlayerSession(token);

        if (session == null) {
            session = new PlayerSession();
            playerSessionMap.put(token, session);
        }

        return session;
    }

    public static synchronized void generateSessionToken(PlayerSession session) {
        String token = session.getSessionToken();

        if (!ObjectUtils.isEmpty(token)) {
            playerSessionMap.remove(token);
        }

        do {
            token = session.generateToken();
        } while (playerSessionMap.containsKey(token));

        // Register session
        playerSessionMap.put(session.getSessionToken(), session);
    }

}
