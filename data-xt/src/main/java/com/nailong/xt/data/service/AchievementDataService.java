package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AchievementDataService {
    private final GameDataMgr gameDataMgr;

    public AchievementConfig getAchievementData(int id) {
        return gameDataMgr.getAchievementConfigMap().get(String.valueOf(id));
    }
    public AchievementConfig getAchievementData(String id) {
        return gameDataMgr.getAchievementConfigMap().get(id);
    }
}
