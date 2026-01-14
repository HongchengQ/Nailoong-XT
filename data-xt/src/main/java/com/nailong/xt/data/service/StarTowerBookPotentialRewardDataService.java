package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerBookPotentialRewardDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookPotentialRewardConfig getStarTowerBookPotentialRewardData(int id) {
        return gameDataMgr.getStarTowerBookPotentialRewardConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookPotentialRewardConfig getStarTowerBookPotentialRewardData(String id) {
        return gameDataMgr.getStarTowerBookPotentialRewardConfigMap().get(id);
    }

    public ArrayList<StarTowerBookPotentialRewardConfig> getAllStarTowerBookPotentialRewardData() {
        return new ArrayList<>(gameDataMgr.getStarTowerBookPotentialRewardConfigMap().values());
    }
}
