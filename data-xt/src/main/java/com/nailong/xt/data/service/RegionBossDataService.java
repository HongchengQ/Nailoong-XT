package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionBossDataService {
    private final GameDataMgr gameDataMgr;

    public RegionBossConfig getRegionBossData(int id) {
        return gameDataMgr.getRegionBossConfigMap().get(String.valueOf(id));
    }
    public RegionBossConfig getRegionBossData(String id) {
        return gameDataMgr.getRegionBossConfigMap().get(id);
    }
}
