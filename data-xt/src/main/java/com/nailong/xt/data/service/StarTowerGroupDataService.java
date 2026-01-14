package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerGroupDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerGroupConfig getStarTowerGroupData(int id) {
        return gameDataMgr.getStarTowerGroupConfigMap().get(String.valueOf(id));
    }
    public StarTowerGroupConfig getStarTowerGroupData(String id) {
        return gameDataMgr.getStarTowerGroupConfigMap().get(id);
    }

    public ArrayList<StarTowerGroupConfig> getAllStarTowerGroupData() {
        return new ArrayList<>(gameDataMgr.getStarTowerGroupConfigMap().values());
    }
}
