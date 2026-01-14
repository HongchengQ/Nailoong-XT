package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerBuildRankDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBuildRankConfig getStarTowerBuildRankData(int id) {
        return gameDataMgr.getStarTowerBuildRankConfigMap().get(String.valueOf(id));
    }
    public StarTowerBuildRankConfig getStarTowerBuildRankData(String id) {
        return gameDataMgr.getStarTowerBuildRankConfigMap().get(id);
    }

    public ArrayList<StarTowerBuildRankConfig> getAllStarTowerBuildRankData() {
        return new ArrayList<>(gameDataMgr.getStarTowerBuildRankConfigMap().values());
    }
}
