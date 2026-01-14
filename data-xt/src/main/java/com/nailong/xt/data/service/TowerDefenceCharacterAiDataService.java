package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenceCharacterAiDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenceCharacterAiConfig getTowerDefenceCharacterAiData(int id) {
        return gameDataMgr.getTowerDefenceCharacterAiConfigMap().get(String.valueOf(id));
    }
    public TowerDefenceCharacterAiConfig getTowerDefenceCharacterAiData(String id) {
        return gameDataMgr.getTowerDefenceCharacterAiConfigMap().get(id);
    }

    public ArrayList<TowerDefenceCharacterAiConfig> getAllTowerDefenceCharacterAiData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenceCharacterAiConfigMap().values());
    }
}
