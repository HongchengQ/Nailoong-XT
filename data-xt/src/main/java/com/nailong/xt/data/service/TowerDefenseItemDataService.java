package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
