package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StoryPersonalityDataService {
    private final GameDataMgr gameDataMgr;

    public StoryPersonalityConfig getStoryPersonalityData(int id) {
        return gameDataMgr.getStoryPersonalityConfigMap().get(String.valueOf(id));
    }
    public StoryPersonalityConfig getStoryPersonalityData(String id) {
        return gameDataMgr.getStoryPersonalityConfigMap().get(id);
    }

    public ArrayList<StoryPersonalityConfig> getAllStoryPersonalityData() {
        return new ArrayList<>(gameDataMgr.getStoryPersonalityConfigMap().values());
    }
}
