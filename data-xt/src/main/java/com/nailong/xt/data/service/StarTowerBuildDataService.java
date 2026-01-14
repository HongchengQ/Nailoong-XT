package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerBuildDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBuildConfig getStarTowerBuildData(int id) {
        return gameDataMgr.getStarTowerBuildConfigMap().get(String.valueOf(id));
    }
    public StarTowerBuildConfig getStarTowerBuildData(String id) {
        return gameDataMgr.getStarTowerBuildConfigMap().get(id);
    }
}
