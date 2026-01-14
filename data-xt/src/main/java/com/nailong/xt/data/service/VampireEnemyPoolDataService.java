package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireEnemyPoolDataService {
    private final GameDataMgr gameDataMgr;

    public VampireEnemyPoolConfig getVampireEnemyPoolData(int id) {
        return gameDataMgr.getVampireEnemyPoolConfigMap().get(String.valueOf(id));
    }
    public VampireEnemyPoolConfig getVampireEnemyPoolData(String id) {
        return gameDataMgr.getVampireEnemyPoolConfigMap().get(id);
    }
}
