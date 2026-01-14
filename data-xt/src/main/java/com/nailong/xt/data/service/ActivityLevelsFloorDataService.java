package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityLevelsFloorDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityLevelsFloorConfig getActivityLevelsFloorData(int id) {
        return gameDataMgr.getActivityLevelsFloorConfigMap().get(String.valueOf(id));
    }
    public ActivityLevelsFloorConfig getActivityLevelsFloorData(String id) {
        return gameDataMgr.getActivityLevelsFloorConfigMap().get(id);
    }

    public ArrayList<ActivityLevelsFloorConfig> getAllActivityLevelsFloorData() {
        return new ArrayList<>(gameDataMgr.getActivityLevelsFloorConfigMap().values());
    }
}
