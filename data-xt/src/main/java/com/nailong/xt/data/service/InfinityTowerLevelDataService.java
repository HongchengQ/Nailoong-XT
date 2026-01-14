package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfinityTowerLevelDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerLevelConfig getInfinityTowerLevelData(int id) {
        return gameDataMgr.getInfinityTowerLevelConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerLevelConfig getInfinityTowerLevelData(String id) {
        return gameDataMgr.getInfinityTowerLevelConfigMap().get(id);
    }
}
