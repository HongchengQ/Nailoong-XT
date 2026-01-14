package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerEventActionDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerEventActionConfig getStarTowerEventActionData(int id) {
        return gameDataMgr.getStarTowerEventActionConfigMap().get(String.valueOf(id));
    }
    public StarTowerEventActionConfig getStarTowerEventActionData(String id) {
        return gameDataMgr.getStarTowerEventActionConfigMap().get(id);
    }
}
