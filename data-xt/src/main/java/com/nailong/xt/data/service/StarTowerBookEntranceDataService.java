package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerBookEntranceDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookEntranceConfig getStarTowerBookEntranceData(int id) {
        return gameDataMgr.getStarTowerBookEntranceConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookEntranceConfig getStarTowerBookEntranceData(String id) {
        return gameDataMgr.getStarTowerBookEntranceConfigMap().get(id);
    }

    public ArrayList<StarTowerBookEntranceConfig> getAllStarTowerBookEntranceData() {
        return new ArrayList<>(gameDataMgr.getStarTowerBookEntranceConfigMap().values());
    }
}
