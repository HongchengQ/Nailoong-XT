package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerMapDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerMapConfig getStarTowerMapData(int id) {
        return gameDataMgr.getStarTowerMapConfigMap().get(String.valueOf(id));
    }
    public StarTowerMapConfig getStarTowerMapData(String id) {
        return gameDataMgr.getStarTowerMapConfigMap().get(id);
    }
}
