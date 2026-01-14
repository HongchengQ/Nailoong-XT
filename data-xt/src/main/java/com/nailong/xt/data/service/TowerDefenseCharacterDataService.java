package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseCharacterDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseCharacterConfig getTowerDefenseCharacterData(int id) {
        return gameDataMgr.getTowerDefenseCharacterConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseCharacterConfig getTowerDefenseCharacterData(String id) {
        return gameDataMgr.getTowerDefenseCharacterConfigMap().get(id);
    }

    public ArrayList<TowerDefenseCharacterConfig> getAllTowerDefenseCharacterData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseCharacterConfigMap().values());
    }
}
