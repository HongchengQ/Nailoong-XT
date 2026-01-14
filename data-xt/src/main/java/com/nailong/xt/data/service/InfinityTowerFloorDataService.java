package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfinityTowerFloorDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerFloorConfig getInfinityTowerFloorData(int id) {
        return gameDataMgr.getInfinityTowerFloorConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerFloorConfig getInfinityTowerFloorData(String id) {
        return gameDataMgr.getInfinityTowerFloorConfigMap().get(id);
    }
}
