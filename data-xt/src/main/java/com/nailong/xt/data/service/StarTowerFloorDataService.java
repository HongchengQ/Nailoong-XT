package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerFloorDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerFloorConfig getStarTowerFloorData(int id) {
        return gameDataMgr.getStarTowerFloorConfigMap().get(String.valueOf(id));
    }
    public StarTowerFloorConfig getStarTowerFloorData(String id) {
        return gameDataMgr.getStarTowerFloorConfigMap().get(id);
    }
}
