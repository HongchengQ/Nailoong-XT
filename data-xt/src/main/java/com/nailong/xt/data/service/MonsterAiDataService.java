package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterAiDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterAiConfig getMonsterAiData(int id) {
        return gameDataMgr.getMonsterAiConfigMap().get(String.valueOf(id));
    }
    public MonsterAiConfig getMonsterAiData(String id) {
        return gameDataMgr.getMonsterAiConfigMap().get(id);
    }

    public ArrayList<MonsterAiConfig> getAllMonsterAiData() {
        return new ArrayList<>(gameDataMgr.getMonsterAiConfigMap().values());
    }
}
