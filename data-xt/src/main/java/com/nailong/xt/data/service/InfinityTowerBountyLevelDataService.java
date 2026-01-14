package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfinityTowerBountyLevelDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerBountyLevelConfig getInfinityTowerBountyLevelData(int id) {
        return gameDataMgr.getInfinityTowerBountyLevelConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerBountyLevelConfig getInfinityTowerBountyLevelData(String id) {
        return gameDataMgr.getInfinityTowerBountyLevelConfigMap().get(id);
    }
}
