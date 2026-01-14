package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerEventOptionActionDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerEventOptionActionConfig getStarTowerEventOptionActionData(int id) {
        return gameDataMgr.getStarTowerEventOptionActionConfigMap().get(String.valueOf(id));
    }
    public StarTowerEventOptionActionConfig getStarTowerEventOptionActionData(String id) {
        return gameDataMgr.getStarTowerEventOptionActionConfigMap().get(id);
    }
}
