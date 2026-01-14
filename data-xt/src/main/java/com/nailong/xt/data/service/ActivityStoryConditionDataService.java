package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityStoryConditionDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityStoryConditionConfig getActivityStoryConditionData(int id) {
        return gameDataMgr.getActivityStoryConditionConfigMap().get(String.valueOf(id));
    }
    public ActivityStoryConditionConfig getActivityStoryConditionData(String id) {
        return gameDataMgr.getActivityStoryConditionConfigMap().get(id);
    }

    public ArrayList<ActivityStoryConditionConfig> getAllActivityStoryConditionData() {
        return new ArrayList<>(gameDataMgr.getActivityStoryConditionConfigMap().values());
    }
}
