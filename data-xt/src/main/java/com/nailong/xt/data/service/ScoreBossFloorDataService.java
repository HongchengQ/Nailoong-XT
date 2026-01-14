package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ScoreBossFloorDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossFloorConfig getScoreBossFloorData(int id) {
        return gameDataMgr.getScoreBossFloorConfigMap().get(String.valueOf(id));
    }
    public ScoreBossFloorConfig getScoreBossFloorData(String id) {
        return gameDataMgr.getScoreBossFloorConfigMap().get(id);
    }

    public ArrayList<ScoreBossFloorConfig> getAllScoreBossFloorData() {
        return new ArrayList<>(gameDataMgr.getScoreBossFloorConfigMap().values());
    }
}
