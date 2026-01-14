package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerBookFateCardBundleDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookFateCardBundleConfig getStarTowerBookFateCardBundleData(int id) {
        return gameDataMgr.getStarTowerBookFateCardBundleConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookFateCardBundleConfig getStarTowerBookFateCardBundleData(String id) {
        return gameDataMgr.getStarTowerBookFateCardBundleConfigMap().get(id);
    }

    public ArrayList<StarTowerBookFateCardBundleConfig> getAllStarTowerBookFateCardBundleData() {
        return new ArrayList<>(gameDataMgr.getStarTowerBookFateCardBundleConfigMap().values());
    }
}
