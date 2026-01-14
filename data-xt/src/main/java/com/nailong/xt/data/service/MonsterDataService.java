package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonsterDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterConfig getMonsterData(int id) {
        return gameDataMgr.getMonsterConfigMap().get(String.valueOf(id));
    }
    public MonsterConfig getMonsterData(String id) {
        return gameDataMgr.getMonsterConfigMap().get(id);
    }
}
