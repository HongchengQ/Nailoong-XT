package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefensePotentialDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefensePotentialConfig getTowerDefensePotentialData(int id) {
        return gameDataMgr.getTowerDefensePotentialConfigMap().get(String.valueOf(id));
    }
    public TowerDefensePotentialConfig getTowerDefensePotentialData(String id) {
        return gameDataMgr.getTowerDefensePotentialConfigMap().get(id);
    }

    public ArrayList<TowerDefensePotentialConfig> getAllTowerDefensePotentialData() {
        return new ArrayList<>(gameDataMgr.getTowerDefensePotentialConfigMap().values());
    }
}
