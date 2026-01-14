package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseGuideDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseGuideConfig getTowerDefenseGuideData(int id) {
        return gameDataMgr.getTowerDefenseGuideConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseGuideConfig getTowerDefenseGuideData(String id) {
        return gameDataMgr.getTowerDefenseGuideConfigMap().get(id);
    }

    public ArrayList<TowerDefenseGuideConfig> getAllTowerDefenseGuideData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseGuideConfigMap().values());
    }
}
