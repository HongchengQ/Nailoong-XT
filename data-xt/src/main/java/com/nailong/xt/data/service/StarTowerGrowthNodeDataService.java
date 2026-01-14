package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerGrowthNodeDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerGrowthNodeConfig getStarTowerGrowthNodeData(int id) {
        return gameDataMgr.getStarTowerGrowthNodeConfigMap().get(String.valueOf(id));
    }
    public StarTowerGrowthNodeConfig getStarTowerGrowthNodeData(String id) {
        return gameDataMgr.getStarTowerGrowthNodeConfigMap().get(id);
    }

    public ArrayList<StarTowerGrowthNodeConfig> getAllStarTowerGrowthNodeData() {
        return new ArrayList<>(gameDataMgr.getStarTowerGrowthNodeConfigMap().values());
    }
}
