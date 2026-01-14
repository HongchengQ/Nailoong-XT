package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerSpModeDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerSpModeConfig getStarTowerSpModeData(int id) {
        return gameDataMgr.getStarTowerSpModeConfigMap().get(String.valueOf(id));
    }
    public StarTowerSpModeConfig getStarTowerSpModeData(String id) {
        return gameDataMgr.getStarTowerSpModeConfigMap().get(id);
    }
}
