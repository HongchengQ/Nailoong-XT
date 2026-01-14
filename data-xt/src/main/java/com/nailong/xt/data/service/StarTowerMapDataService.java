package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<StarTowerMapConfig> getAllStarTowerMapData() {
        return new ArrayList<>(gameDataMgr.getStarTowerMapConfigMap().values());
    }
}
