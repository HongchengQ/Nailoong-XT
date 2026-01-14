package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BattlePassLevelDataService {
    private final GameDataMgr gameDataMgr;

    public BattlePassLevelConfig getBattlePassLevelData(int id) {
        return gameDataMgr.getBattlePassLevelConfigMap().get(String.valueOf(id));
    }
    public BattlePassLevelConfig getBattlePassLevelData(String id) {
        return gameDataMgr.getBattlePassLevelConfigMap().get(id);
    }
}
