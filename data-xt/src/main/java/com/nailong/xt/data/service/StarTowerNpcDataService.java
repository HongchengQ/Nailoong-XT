package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerNpcDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerNpcConfig getStarTowerNpcData(int id) {
        return gameDataMgr.getStarTowerNpcConfigMap().get(String.valueOf(id));
    }
    public StarTowerNpcConfig getStarTowerNpcData(String id) {
        return gameDataMgr.getStarTowerNpcConfigMap().get(id);
    }
}
