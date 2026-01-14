package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossBattleThresholdDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossBattleThresholdConfig getScoreBossBattleThresholdData(int id) {
        return gameDataMgr.getScoreBossBattleThresholdConfigMap().get(String.valueOf(id));
    }
    public ScoreBossBattleThresholdConfig getScoreBossBattleThresholdData(String id) {
        return gameDataMgr.getScoreBossBattleThresholdConfigMap().get(id);
    }

    public ArrayList<ScoreBossBattleThresholdConfig> getAllScoreBossBattleThresholdData() {
        return new ArrayList<>(gameDataMgr.getScoreBossBattleThresholdConfigMap().values());
    }
}
