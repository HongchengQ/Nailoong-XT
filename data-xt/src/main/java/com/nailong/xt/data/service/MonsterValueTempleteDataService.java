package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonsterValueTempleteDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterValueTempleteConfig getMonsterValueTempleteData(int id) {
        return gameDataMgr.getMonsterValueTempleteConfigMap().get(String.valueOf(id));
    }
    public MonsterValueTempleteConfig getMonsterValueTempleteData(String id) {
        return gameDataMgr.getMonsterValueTempleteConfigMap().get(id);
    }
}
