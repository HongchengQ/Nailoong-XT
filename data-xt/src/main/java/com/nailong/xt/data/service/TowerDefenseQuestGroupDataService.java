package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TowerDefenseQuestGroupDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseQuestGroupConfig getTowerDefenseQuestGroupData(int id) {
        return gameDataMgr.getTowerDefenseQuestGroupConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseQuestGroupConfig getTowerDefenseQuestGroupData(String id) {
        return gameDataMgr.getTowerDefenseQuestGroupConfigMap().get(id);
    }
}
