package com.nailong.xt.gate.network;

import com.nailong.xt.gate.balancer.ConsulGameServerLoadBalancer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Slf4j
@ToString
@Service
@RequiredArgsConstructor
public class PlayerSessionMgr {
    // key:     token
    // value:   session
    public static Map<String, PlayerSession> playerSessionMap = new ConcurrentHashMap<>(1000);

    private final ConsulGameServerLoadBalancer consulGameServerLoadBalancer;

    public static PlayerSession findPlayerSession(String token) {
        return playerSessionMap.get(token);
    }

    public PlayerSession findOrCreatePlayerSession(String token) {
        if (ObjectUtils.isEmpty(token)) {
            return generatePlayerSession();
        }

        PlayerSession session;

        session = findPlayerSession(token);

        if (session == null) {
            session = generatePlayerSession();
        }

        log.info("当前 playerSessionMap -> {}", playerSessionMap.toString());

        return session;
    }

    public static synchronized String generateSessionToken(PlayerSession session) {
        String token = session.getSessionToken();

        if (!ObjectUtils.isEmpty(token)) {
            playerSessionMap.remove(token);
        }

        do {
            token = session.generateToken();
        } while (playerSessionMap.containsKey(token));

        // Register session
        playerSessionMap.put(session.getSessionToken(), session);

        return token;
    }

    public PlayerSession generatePlayerSession() {
        PlayerSession session;

        ServiceInstance instance = consulGameServerLoadBalancer.getLowestLoadInstance();

        session = new PlayerSession(instance);
        generateSessionToken(session);

        return session;
    }

}
