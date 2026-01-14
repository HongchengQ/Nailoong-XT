package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterTeamDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterTeamConfig getMonsterTeamData(int id) {
        return gameDataMgr.getMonsterTeamConfigMap().get(String.valueOf(id));
    }
    public MonsterTeamConfig getMonsterTeamData(String id) {
        return gameDataMgr.getMonsterTeamConfigMap().get(id);
    }

    public ArrayList<MonsterTeamConfig> getAllMonsterTeamData() {
        return new ArrayList<>(gameDataMgr.getMonsterTeamConfigMap().values());
    }
}
