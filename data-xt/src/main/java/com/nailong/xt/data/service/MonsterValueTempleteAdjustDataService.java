package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterValueTempleteAdjustDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterValueTempleteAdjustConfig getMonsterValueTempleteAdjustData(int id) {
        return gameDataMgr.getMonsterValueTempleteAdjustConfigMap().get(String.valueOf(id));
    }
    public MonsterValueTempleteAdjustConfig getMonsterValueTempleteAdjustData(String id) {
        return gameDataMgr.getMonsterValueTempleteAdjustConfigMap().get(id);
    }

    public ArrayList<MonsterValueTempleteAdjustConfig> getAllMonsterValueTempleteAdjustData() {
        return new ArrayList<>(gameDataMgr.getMonsterValueTempleteAdjustConfigMap().values());
    }
}
