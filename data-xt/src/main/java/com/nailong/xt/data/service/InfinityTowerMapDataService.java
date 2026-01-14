package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class InfinityTowerMapDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerMapConfig getInfinityTowerMapData(int id) {
        return gameDataMgr.getInfinityTowerMapConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerMapConfig getInfinityTowerMapData(String id) {
        return gameDataMgr.getInfinityTowerMapConfigMap().get(id);
    }

    public ArrayList<InfinityTowerMapConfig> getAllInfinityTowerMapData() {
        return new ArrayList<>(gameDataMgr.getInfinityTowerMapConfigMap().values());
    }
}
