package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StoryConditionDataService {
    private final GameDataMgr gameDataMgr;

    public StoryConditionConfig getStoryConditionData(int id) {
        return gameDataMgr.getStoryConditionConfigMap().get(String.valueOf(id));
    }
    public StoryConditionConfig getStoryConditionData(String id) {
        return gameDataMgr.getStoryConditionConfigMap().get(id);
    }

    public ArrayList<StoryConditionConfig> getAllStoryConditionData() {
        return new ArrayList<>(gameDataMgr.getStoryConditionConfigMap().values());
    }
}
