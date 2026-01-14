package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TowerDefenseTeamExpDataService {
    private final GameDataMgr gameDataMgr;

    public TowerDefenseTeamExpConfig getTowerDefenseTeamExpData(int id) {
        return gameDataMgr.getTowerDefenseTeamExpConfigMap().get(String.valueOf(id));
    }
    public TowerDefenseTeamExpConfig getTowerDefenseTeamExpData(String id) {
        return gameDataMgr.getTowerDefenseTeamExpConfigMap().get(id);
    }

    public ArrayList<TowerDefenseTeamExpConfig> getAllTowerDefenseTeamExpData() {
        return new ArrayList<>(gameDataMgr.getTowerDefenseTeamExpConfigMap().values());
    }
}
