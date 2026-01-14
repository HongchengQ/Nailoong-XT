package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireSurvivorLevelDataService {
    private final GameDataMgr gameDataMgr;

    public VampireSurvivorLevelConfig getVampireSurvivorLevelData(int id) {
        return gameDataMgr.getVampireSurvivorLevelConfigMap().get(String.valueOf(id));
    }
    public VampireSurvivorLevelConfig getVampireSurvivorLevelData(String id) {
        return gameDataMgr.getVampireSurvivorLevelConfigMap().get(id);
    }

    public ArrayList<VampireSurvivorLevelConfig> getAllVampireSurvivorLevelData() {
        return new ArrayList<>(gameDataMgr.getVampireSurvivorLevelConfigMap().values());
    }
}
