package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AffinityLevelDataService {
    private final GameDataMgr gameDataMgr;

    public AffinityLevelConfig getAffinityLevelData(int id) {
        return gameDataMgr.getAffinityLevelConfigMap().get(String.valueOf(id));
    }
    public AffinityLevelConfig getAffinityLevelData(String id) {
        return gameDataMgr.getAffinityLevelConfigMap().get(id);
    }
}
