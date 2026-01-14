package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityLevelsLevelDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityLevelsLevelConfig getActivityLevelsLevelData(int id) {
        return gameDataMgr.getActivityLevelsLevelConfigMap().get(String.valueOf(id));
    }
    public ActivityLevelsLevelConfig getActivityLevelsLevelData(String id) {
        return gameDataMgr.getActivityLevelsLevelConfigMap().get(id);
    }
}
