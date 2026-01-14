package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<RegionBossConfig> getAllRegionBossData() {
        return new ArrayList<>(gameDataMgr.getRegionBossConfigMap().values());
    }
}
