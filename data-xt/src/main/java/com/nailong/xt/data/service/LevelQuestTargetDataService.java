package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class LevelQuestTargetDataService {
    private final GameDataMgr gameDataMgr;

    public LevelQuestTargetConfig getLevelQuestTargetData(int id) {
        return gameDataMgr.getLevelQuestTargetConfigMap().get(String.valueOf(id));
    }
    public LevelQuestTargetConfig getLevelQuestTargetData(String id) {
        return gameDataMgr.getLevelQuestTargetConfigMap().get(id);
    }

    public ArrayList<LevelQuestTargetConfig> getAllLevelQuestTargetData() {
        return new ArrayList<>(gameDataMgr.getLevelQuestTargetConfigMap().values());
    }
}
