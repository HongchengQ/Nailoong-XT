package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerEnemySetDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerEnemySetConfig getStarTowerEnemySetData(int id) {
        return gameDataMgr.getStarTowerEnemySetConfigMap().get(String.valueOf(id));
    }
    public StarTowerEnemySetConfig getStarTowerEnemySetData(String id) {
        return gameDataMgr.getStarTowerEnemySetConfigMap().get(id);
    }

    public ArrayList<StarTowerEnemySetConfig> getAllStarTowerEnemySetData() {
        return new ArrayList<>(gameDataMgr.getStarTowerEnemySetConfigMap().values());
    }
}
