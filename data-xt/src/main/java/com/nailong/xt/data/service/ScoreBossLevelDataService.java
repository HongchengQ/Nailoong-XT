package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossLevelDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossLevelConfig getScoreBossLevelData(int id) {
        return gameDataMgr.getScoreBossLevelConfigMap().get(String.valueOf(id));
    }
    public ScoreBossLevelConfig getScoreBossLevelData(String id) {
        return gameDataMgr.getScoreBossLevelConfigMap().get(id);
    }

    public ArrayList<ScoreBossLevelConfig> getAllScoreBossLevelData() {
        return new ArrayList<>(gameDataMgr.getScoreBossLevelConfigMap().values());
    }
}
