package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseMonsterDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseMonsterConfig getTowerDefenseMonsterData(int id) {
        return gameDataMgr.getTowerDefenseMonsterConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseMonsterConfig getTowerDefenseMonsterData(String id) {
        return gameDataMgr.getTowerDefenseMonsterConfigMap().get(id);
    }

    public ArrayList<TowerDefenseMonsterConfig> getAllTowerDefenseMonsterData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseMonsterConfigMap().values());
    }
}
