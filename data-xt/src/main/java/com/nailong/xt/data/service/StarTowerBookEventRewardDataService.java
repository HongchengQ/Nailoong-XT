package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerBookEventRewardDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookEventRewardConfig getStarTowerBookEventRewardData(int id) {
        return gameDataMgr.getStarTowerBookEventRewardConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookEventRewardConfig getStarTowerBookEventRewardData(String id) {
        return gameDataMgr.getStarTowerBookEventRewardConfigMap().get(id);
    }
}
