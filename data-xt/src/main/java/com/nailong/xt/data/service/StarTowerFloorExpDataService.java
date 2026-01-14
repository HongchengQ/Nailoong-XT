package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerFloorExpDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerFloorExpConfig getStarTowerFloorExpData(int id) {
        return gameDataMgr.getStarTowerFloorExpConfigMap().get(String.valueOf(id));
    }
    public StarTowerFloorExpConfig getStarTowerFloorExpData(String id) {
        return gameDataMgr.getStarTowerFloorExpConfigMap().get(id);
    }
}
