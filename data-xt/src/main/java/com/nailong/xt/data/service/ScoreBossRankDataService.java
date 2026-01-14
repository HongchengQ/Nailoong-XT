package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossRankDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossRankConfig getScoreBossRankData(int id) {
        return gameDataMgr.getScoreBossRankConfigMap().get(String.valueOf(id));
    }
    public ScoreBossRankConfig getScoreBossRankData(String id) {
        return gameDataMgr.getScoreBossRankConfigMap().get(id);
    }

    public ArrayList<ScoreBossRankConfig> getAllScoreBossRankData() {
        return new ArrayList<>(gameDataMgr.getScoreBossRankConfigMap().values());
    }
}
