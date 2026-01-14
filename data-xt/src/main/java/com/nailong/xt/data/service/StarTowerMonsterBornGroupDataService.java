package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerMonsterBornGroupDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerMonsterBornGroupConfig getStarTowerMonsterBornGroupData(int id) {
        return gameDataMgr.getStarTowerMonsterBornGroupConfigMap().get(String.valueOf(id));
    }
    public StarTowerMonsterBornGroupConfig getStarTowerMonsterBornGroupData(String id) {
        return gameDataMgr.getStarTowerMonsterBornGroupConfigMap().get(id);
    }
}
