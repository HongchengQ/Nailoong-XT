package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerStageDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerStageConfig getStarTowerStageData(int id) {
        return gameDataMgr.getStarTowerStageConfigMap().get(String.valueOf(id));
    }
    public StarTowerStageConfig getStarTowerStageData(String id) {
        return gameDataMgr.getStarTowerStageConfigMap().get(id);
    }
}
