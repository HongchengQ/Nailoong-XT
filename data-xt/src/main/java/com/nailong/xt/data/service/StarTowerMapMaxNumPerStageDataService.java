package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerMapMaxNumPerStageDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerMapMaxNumPerStageConfig getStarTowerMapMaxNumPerStageData(int id) {
        return gameDataMgr.getStarTowerMapMaxNumPerStageConfigMap().get(String.valueOf(id));
    }
    public StarTowerMapMaxNumPerStageConfig getStarTowerMapMaxNumPerStageData(String id) {
        return gameDataMgr.getStarTowerMapMaxNumPerStageConfigMap().get(id);
    }

    public ArrayList<StarTowerMapMaxNumPerStageConfig> getAllStarTowerMapMaxNumPerStageData() {
        return new ArrayList<>(gameDataMgr.getStarTowerMapMaxNumPerStageConfigMap().values());
    }
}
