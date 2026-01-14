package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StoryDataService {
    private final GameDataMgr gameDataMgr;

    public StoryConfig getStoryData(int id) {
        return gameDataMgr.getStoryConfigMap().get(String.valueOf(id));
    }
    public StoryConfig getStoryData(String id) {
        return gameDataMgr.getStoryConfigMap().get(id);
    }

    public ArrayList<StoryConfig> getAllStoryData() {
        return new ArrayList<>(gameDataMgr.getStoryConfigMap().values());
    }
}
