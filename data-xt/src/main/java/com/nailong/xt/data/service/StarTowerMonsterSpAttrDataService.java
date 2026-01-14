package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerMonsterSpAttrDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerMonsterSpAttrConfig getStarTowerMonsterSpAttrData(int id) {
        return gameDataMgr.getStarTowerMonsterSpAttrConfigMap().get(String.valueOf(id));
    }
    public StarTowerMonsterSpAttrConfig getStarTowerMonsterSpAttrData(String id) {
        return gameDataMgr.getStarTowerMonsterSpAttrConfigMap().get(id);
    }

    public ArrayList<StarTowerMonsterSpAttrConfig> getAllStarTowerMonsterSpAttrData() {
        return new ArrayList<>(gameDataMgr.getStarTowerMonsterSpAttrConfigMap().values());
    }
}
