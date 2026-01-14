package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerFloorSetDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerFloorSetConfig getStarTowerFloorSetData(int id) {
        return gameDataMgr.getStarTowerFloorSetConfigMap().get(String.valueOf(id));
    }
    public StarTowerFloorSetConfig getStarTowerFloorSetData(String id) {
        return gameDataMgr.getStarTowerFloorSetConfigMap().get(id);
    }
}
