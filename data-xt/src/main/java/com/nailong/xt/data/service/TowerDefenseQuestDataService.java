package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseQuestDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseQuestConfig getTowerDefenseQuestData(int id) {
        return gameDataMgr.getTowerDefenseQuestConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseQuestConfig getTowerDefenseQuestData(String id) {
        return gameDataMgr.getTowerDefenseQuestConfigMap().get(id);
    }

    public ArrayList<TowerDefenseQuestConfig> getAllTowerDefenseQuestData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseQuestConfigMap().values());
    }
}
