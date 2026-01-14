package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TowerDefenseLevelDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseLevelConfig getTowerDefenseLevelData(int id) {
        return gameDataMgr.getTowerDefenseLevelConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseLevelConfig getTowerDefenseLevelData(String id) {
        return gameDataMgr.getTowerDefenseLevelConfigMap().get(id);
    }
}
