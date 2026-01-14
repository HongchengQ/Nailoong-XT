package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerDropItemDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerDropItemConfig getStarTowerDropItemData(int id) {
        return gameDataMgr.getStarTowerDropItemConfigMap().get(String.valueOf(id));
    }
    public StarTowerDropItemConfig getStarTowerDropItemData(String id) {
        return gameDataMgr.getStarTowerDropItemConfigMap().get(id);
    }

    public ArrayList<StarTowerDropItemConfig> getAllStarTowerDropItemData() {
        return new ArrayList<>(gameDataMgr.getStarTowerDropItemConfigMap().values());
    }
}
