package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<ActivityLevelsLevelConfig> getAllActivityLevelsLevelData() {
        return new ArrayList<>(gameDataMgr.getActivityLevelsLevelConfigMap().values());
    }
}
