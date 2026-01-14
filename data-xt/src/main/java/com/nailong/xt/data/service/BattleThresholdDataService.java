package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BattleThresholdDataService {
    private final GameDataMgr gameDataMgr;

    public BattleThresholdConfig getBattleThresholdData(int id) {
        return gameDataMgr.getBattleThresholdConfigMap().get(String.valueOf(id));
    }
    public BattleThresholdConfig getBattleThresholdData(String id) {
        return gameDataMgr.getBattleThresholdConfigMap().get(id);
    }
}
