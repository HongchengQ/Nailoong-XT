package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityAvgLevelDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityAvgLevelConfig getActivityAvgLevelData(int id) {
        return gameDataMgr.getActivityAvgLevelConfigMap().get(String.valueOf(id));
    }
    public ActivityAvgLevelConfig getActivityAvgLevelData(String id) {
        return gameDataMgr.getActivityAvgLevelConfigMap().get(id);
    }
}
