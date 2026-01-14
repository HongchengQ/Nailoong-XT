package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
