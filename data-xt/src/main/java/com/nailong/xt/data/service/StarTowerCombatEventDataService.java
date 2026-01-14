package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerCombatEventDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerCombatEventConfig getStarTowerCombatEventData(int id) {
        return gameDataMgr.getStarTowerCombatEventConfigMap().get(String.valueOf(id));
    }
    public StarTowerCombatEventConfig getStarTowerCombatEventData(String id) {
        return gameDataMgr.getStarTowerCombatEventConfigMap().get(id);
    }

    public ArrayList<StarTowerCombatEventConfig> getAllStarTowerCombatEventData() {
        return new ArrayList<>(gameDataMgr.getStarTowerCombatEventConfigMap().values());
    }
}
