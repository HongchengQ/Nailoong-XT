package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class LevelQuestDataService {
    private final GameDataMgr gameDataMgr;

    public LevelQuestConfig getLevelQuestData(int id) {
        return gameDataMgr.getLevelQuestConfigMap().get(String.valueOf(id));
    }
    public LevelQuestConfig getLevelQuestData(String id) {
        return gameDataMgr.getLevelQuestConfigMap().get(id);
    }

    public ArrayList<LevelQuestConfig> getAllLevelQuestData() {
        return new ArrayList<>(gameDataMgr.getLevelQuestConfigMap().values());
    }
}
