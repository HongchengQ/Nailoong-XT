package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerTeamExpDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerTeamExpConfig getStarTowerTeamExpData(int id) {
        return gameDataMgr.getStarTowerTeamExpConfigMap().get(String.valueOf(id));
    }
    public StarTowerTeamExpConfig getStarTowerTeamExpData(String id) {
        return gameDataMgr.getStarTowerTeamExpConfigMap().get(id);
    }

    public ArrayList<StarTowerTeamExpConfig> getAllStarTowerTeamExpData() {
        return new ArrayList<>(gameDataMgr.getStarTowerTeamExpConfigMap().values());
    }
}
