package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseControlDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseControlConfig getTowerDefenseControlData(int id) {
        return gameDataMgr.getTowerDefenseControlConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseControlConfig getTowerDefenseControlData(String id) {
        return gameDataMgr.getTowerDefenseControlConfigMap().get(id);
    }

    public ArrayList<TowerDefenseControlConfig> getAllTowerDefenseControlData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseControlConfigMap().values());
    }
}
