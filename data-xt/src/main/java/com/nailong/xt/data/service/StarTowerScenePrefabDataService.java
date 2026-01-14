package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerScenePrefabDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerScenePrefabConfig getStarTowerScenePrefabData(int id) {
        return gameDataMgr.getStarTowerScenePrefabConfigMap().get(String.valueOf(id));
    }
    public StarTowerScenePrefabConfig getStarTowerScenePrefabData(String id) {
        return gameDataMgr.getStarTowerScenePrefabConfigMap().get(id);
    }

    public ArrayList<StarTowerScenePrefabConfig> getAllStarTowerScenePrefabData() {
        return new ArrayList<>(gameDataMgr.getStarTowerScenePrefabConfigMap().values());
    }
}
