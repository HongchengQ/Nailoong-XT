package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerEventDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerEventConfig getStarTowerEventData(int id) {
        return gameDataMgr.getStarTowerEventConfigMap().get(String.valueOf(id));
    }
    public StarTowerEventConfig getStarTowerEventData(String id) {
        return gameDataMgr.getStarTowerEventConfigMap().get(id);
    }

    public ArrayList<StarTowerEventConfig> getAllStarTowerEventData() {
        return new ArrayList<>(gameDataMgr.getStarTowerEventConfigMap().values());
    }
}
