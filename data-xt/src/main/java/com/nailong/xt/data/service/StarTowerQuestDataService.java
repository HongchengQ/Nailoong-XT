package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerQuestDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerQuestConfig getStarTowerQuestData(int id) {
        return gameDataMgr.getStarTowerQuestConfigMap().get(String.valueOf(id));
    }
    public StarTowerQuestConfig getStarTowerQuestData(String id) {
        return gameDataMgr.getStarTowerQuestConfigMap().get(id);
    }

    public ArrayList<StarTowerQuestConfig> getAllStarTowerQuestData() {
        return new ArrayList<>(gameDataMgr.getStarTowerQuestConfigMap().values());
    }
}
