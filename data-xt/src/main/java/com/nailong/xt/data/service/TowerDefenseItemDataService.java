package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseItemDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseItemConfig getTowerDefenseItemData(int id) {
        return gameDataMgr.getTowerDefenseItemConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseItemConfig getTowerDefenseItemData(String id) {
        return gameDataMgr.getTowerDefenseItemConfigMap().get(id);
    }

    public ArrayList<TowerDefenseItemConfig> getAllTowerDefenseItemData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseItemConfigMap().values());
    }
}
