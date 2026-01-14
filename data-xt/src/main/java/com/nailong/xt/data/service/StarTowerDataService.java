package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerConfig getStarTowerData(int id) {
        return gameDataMgr.getStarTowerConfigMap().get(String.valueOf(id));
    }
    public StarTowerConfig getStarTowerData(String id) {
        return gameDataMgr.getStarTowerConfigMap().get(id);
    }
}
