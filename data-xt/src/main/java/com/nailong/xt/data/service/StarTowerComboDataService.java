package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerComboDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerComboConfig getStarTowerComboData(int id) {
        return gameDataMgr.getStarTowerComboConfigMap().get(String.valueOf(id));
    }
    public StarTowerComboConfig getStarTowerComboData(String id) {
        return gameDataMgr.getStarTowerComboConfigMap().get(id);
    }

    public ArrayList<StarTowerComboConfig> getAllStarTowerComboData() {
        return new ArrayList<>(gameDataMgr.getStarTowerComboConfigMap().values());
    }
}
