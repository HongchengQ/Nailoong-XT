package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class RegionBossLevelDataService {
    private final GameDataMgr gameDataMgr;

    public RegionBossLevelConfig getRegionBossLevelData(int id) {
        return gameDataMgr.getRegionBossLevelConfigMap().get(String.valueOf(id));
    }
    public RegionBossLevelConfig getRegionBossLevelData(String id) {
        return gameDataMgr.getRegionBossLevelConfigMap().get(id);
    }

    public ArrayList<RegionBossLevelConfig> getAllRegionBossLevelData() {
        return new ArrayList<>(gameDataMgr.getRegionBossLevelConfigMap().values());
    }
}
