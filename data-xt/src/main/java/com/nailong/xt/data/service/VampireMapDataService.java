package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireMapDataService {
    private final GameDataMgr gameDataMgr;

    public VampireMapConfig getVampireMapData(int id) {
        return gameDataMgr.getVampireMapConfigMap().get(String.valueOf(id));
    }
    public VampireMapConfig getVampireMapData(String id) {
        return gameDataMgr.getVampireMapConfigMap().get(id);
    }
}
