package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreGetSwitchDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreGetSwitchConfig getScoreGetSwitchData(int id) {
        return gameDataMgr.getScoreGetSwitchConfigMap().get(String.valueOf(id));
    }
    public ScoreGetSwitchConfig getScoreGetSwitchData(String id) {
        return gameDataMgr.getScoreGetSwitchConfigMap().get(id);
    }
}
