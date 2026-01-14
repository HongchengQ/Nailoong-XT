package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossStarDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossStarConfig getScoreBossStarData(int id) {
        return gameDataMgr.getScoreBossStarConfigMap().get(String.valueOf(id));
    }
    public ScoreBossStarConfig getScoreBossStarData(String id) {
        return gameDataMgr.getScoreBossStarConfigMap().get(id);
    }

    public ArrayList<ScoreBossStarConfig> getAllScoreBossStarData() {
        return new ArrayList<>(gameDataMgr.getScoreBossStarConfigMap().values());
    }
}
