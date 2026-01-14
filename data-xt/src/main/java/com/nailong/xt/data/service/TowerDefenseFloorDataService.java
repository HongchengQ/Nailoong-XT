package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseFloorDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseFloorConfig getTowerDefenseFloorData(int id) {
        return gameDataMgr.getTowerDefenseFloorConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseFloorConfig getTowerDefenseFloorData(String id) {
        return gameDataMgr.getTowerDefenseFloorConfigMap().get(id);
    }

    public ArrayList<TowerDefenseFloorConfig> getAllTowerDefenseFloorData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseFloorConfigMap().values());
    }
}
