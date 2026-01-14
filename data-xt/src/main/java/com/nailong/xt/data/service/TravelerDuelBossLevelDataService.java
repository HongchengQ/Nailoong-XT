package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelerDuelBossLevelDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelBossLevelConfig getTravelerDuelBossLevelData(int id) {
        return gameDataMgr.getTravelerDuelBossLevelConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelBossLevelConfig getTravelerDuelBossLevelData(String id) {
        return gameDataMgr.getTravelerDuelBossLevelConfigMap().get(id);
    }
}
