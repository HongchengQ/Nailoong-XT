package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerGrowthGroupDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerGrowthGroupConfig getStarTowerGrowthGroupData(int id) {
        return gameDataMgr.getStarTowerGrowthGroupConfigMap().get(String.valueOf(id));
    }
    public StarTowerGrowthGroupConfig getStarTowerGrowthGroupData(String id) {
        return gameDataMgr.getStarTowerGrowthGroupConfigMap().get(id);
    }
}
