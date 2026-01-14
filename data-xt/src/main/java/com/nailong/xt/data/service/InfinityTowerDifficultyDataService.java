package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfinityTowerDifficultyDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerDifficultyConfig getInfinityTowerDifficultyData(int id) {
        return gameDataMgr.getInfinityTowerDifficultyConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerDifficultyConfig getInfinityTowerDifficultyData(String id) {
        return gameDataMgr.getInfinityTowerDifficultyConfigMap().get(id);
    }
}
