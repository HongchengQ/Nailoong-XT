package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityStoryDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityStoryConfig getActivityStoryData(int id) {
        return gameDataMgr.getActivityStoryConfigMap().get(String.valueOf(id));
    }
    public ActivityStoryConfig getActivityStoryData(String id) {
        return gameDataMgr.getActivityStoryConfigMap().get(id);
    }

    public ArrayList<ActivityStoryConfig> getAllActivityStoryData() {
        return new ArrayList<>(gameDataMgr.getActivityStoryConfigMap().values());
    }
}
