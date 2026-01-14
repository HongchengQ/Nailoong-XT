package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class InfinityTowerEnemySetDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerEnemySetConfig getInfinityTowerEnemySetData(int id) {
        return gameDataMgr.getInfinityTowerEnemySetConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerEnemySetConfig getInfinityTowerEnemySetData(String id) {
        return gameDataMgr.getInfinityTowerEnemySetConfigMap().get(id);
    }

    public ArrayList<InfinityTowerEnemySetConfig> getAllInfinityTowerEnemySetData() {
        return new ArrayList<>(gameDataMgr.getInfinityTowerEnemySetConfigMap().values());
    }
}
