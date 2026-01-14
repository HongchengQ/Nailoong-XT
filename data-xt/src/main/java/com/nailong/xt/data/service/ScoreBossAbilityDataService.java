package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreBossAbilityDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossAbilityConfig getScoreBossAbilityData(int id) {
        return gameDataMgr.getScoreBossAbilityConfigMap().get(String.valueOf(id));
    }
    public ScoreBossAbilityConfig getScoreBossAbilityData(String id) {
        return gameDataMgr.getScoreBossAbilityConfigMap().get(id);
    }
}
