package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterManualDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterManualConfig getMonsterManualData(int id) {
        return gameDataMgr.getMonsterManualConfigMap().get(String.valueOf(id));
    }
    public MonsterManualConfig getMonsterManualData(String id) {
        return gameDataMgr.getMonsterManualConfigMap().get(id);
    }

    public ArrayList<MonsterManualConfig> getAllMonsterManualData() {
        return new ArrayList<>(gameDataMgr.getMonsterManualConfigMap().values());
    }
}
