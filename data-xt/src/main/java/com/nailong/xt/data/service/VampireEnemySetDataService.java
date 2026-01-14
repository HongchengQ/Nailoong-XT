package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireEnemySetDataService {
    private final GameDataMgr gameDataMgr;

    public VampireEnemySetConfig getVampireEnemySetData(int id) {
        return gameDataMgr.getVampireEnemySetConfigMap().get(String.valueOf(id));
    }
    public VampireEnemySetConfig getVampireEnemySetData(String id) {
        return gameDataMgr.getVampireEnemySetConfigMap().get(id);
    }
}
