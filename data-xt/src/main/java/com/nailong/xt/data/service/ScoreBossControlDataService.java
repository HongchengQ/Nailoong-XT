package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossControlDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossControlConfig getScoreBossControlData(int id) {
        return gameDataMgr.getScoreBossControlConfigMap().get(String.valueOf(id));
    }
    public ScoreBossControlConfig getScoreBossControlData(String id) {
        return gameDataMgr.getScoreBossControlConfigMap().get(id);
    }

    public ArrayList<ScoreBossControlConfig> getAllScoreBossControlData() {
        return new ArrayList<>(gameDataMgr.getScoreBossControlConfigMap().values());
    }
}
