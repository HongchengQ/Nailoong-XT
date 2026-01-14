package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StorySetSectionDataService {
    private final GameDataMgr gameDataMgr;

    public StorySetSectionConfig getStorySetSectionData(int id) {
        return gameDataMgr.getStorySetSectionConfigMap().get(String.valueOf(id));
    }
    public StorySetSectionConfig getStorySetSectionData(String id) {
        return gameDataMgr.getStorySetSectionConfigMap().get(id);
    }

    public ArrayList<StorySetSectionConfig> getAllStorySetSectionData() {
        return new ArrayList<>(gameDataMgr.getStorySetSectionConfigMap().values());
    }
}
