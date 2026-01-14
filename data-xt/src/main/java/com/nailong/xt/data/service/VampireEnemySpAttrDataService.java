package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireEnemySpAttrDataService {
    private final GameDataMgr gameDataMgr;

    public VampireEnemySpAttrConfig getVampireEnemySpAttrData(int id) {
        return gameDataMgr.getVampireEnemySpAttrConfigMap().get(String.valueOf(id));
    }
    public VampireEnemySpAttrConfig getVampireEnemySpAttrData(String id) {
        return gameDataMgr.getVampireEnemySpAttrConfigMap().get(id);
    }
}
