package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventOptionsRulesDataService {
    private final GameDataMgr gameDataMgr;

    public EventOptionsRulesConfig getEventOptionsRulesData(int id) {
        return gameDataMgr.getEventOptionsRulesConfigMap().get(String.valueOf(id));
    }
    public EventOptionsRulesConfig getEventOptionsRulesData(String id) {
        return gameDataMgr.getEventOptionsRulesConfigMap().get(id);
    }
}
