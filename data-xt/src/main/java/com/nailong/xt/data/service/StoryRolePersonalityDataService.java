package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoryRolePersonalityDataService {
    private final GameDataMgr gameDataMgr;

    public StoryRolePersonalityConfig getStoryRolePersonalityData(int id) {
        return gameDataMgr.getStoryRolePersonalityConfigMap().get(String.valueOf(id));
    }
    public StoryRolePersonalityConfig getStoryRolePersonalityData(String id) {
        return gameDataMgr.getStoryRolePersonalityConfigMap().get(id);
    }
}
