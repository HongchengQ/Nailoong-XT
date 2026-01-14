package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossGetControlDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossGetControlConfig getScoreBossGetControlData(int id) {
        return gameDataMgr.getScoreBossGetControlConfigMap().get(String.valueOf(id));
    }
    public ScoreBossGetControlConfig getScoreBossGetControlData(String id) {
        return gameDataMgr.getScoreBossGetControlConfigMap().get(id);
    }

    public ArrayList<ScoreBossGetControlConfig> getAllScoreBossGetControlData() {
        return new ArrayList<>(gameDataMgr.getScoreBossGetControlConfigMap().values());
    }
}
