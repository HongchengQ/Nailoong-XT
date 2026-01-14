package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelerDuelBossDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelBossConfig getTravelerDuelBossData(int id) {
        return gameDataMgr.getTravelerDuelBossConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelBossConfig getTravelerDuelBossData(String id) {
        return gameDataMgr.getTravelerDuelBossConfigMap().get(id);
    }
}
