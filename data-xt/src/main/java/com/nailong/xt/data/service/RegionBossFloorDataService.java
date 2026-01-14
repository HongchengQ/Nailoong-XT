package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class RegionBossFloorDataService {
    private final GameDataMgr gameDataMgr;

    public RegionBossFloorConfig getRegionBossFloorData(int id) {
        return gameDataMgr.getRegionBossFloorConfigMap().get(String.valueOf(id));
    }
    public RegionBossFloorConfig getRegionBossFloorData(String id) {
        return gameDataMgr.getRegionBossFloorConfigMap().get(id);
    }

    public ArrayList<RegionBossFloorConfig> getAllRegionBossFloorData() {
        return new ArrayList<>(gameDataMgr.getRegionBossFloorConfigMap().values());
    }
}
