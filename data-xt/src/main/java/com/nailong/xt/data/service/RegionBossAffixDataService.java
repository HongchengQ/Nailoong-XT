package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class RegionBossAffixDataService {
    private final GameDataMgr gameDataMgr;

    public RegionBossAffixConfig getRegionBossAffixData(int id) {
        return gameDataMgr.getRegionBossAffixConfigMap().get(String.valueOf(id));
    }
    public RegionBossAffixConfig getRegionBossAffixData(String id) {
        return gameDataMgr.getRegionBossAffixConfigMap().get(id);
    }

    public ArrayList<RegionBossAffixConfig> getAllRegionBossAffixData() {
        return new ArrayList<>(gameDataMgr.getRegionBossAffixConfigMap().values());
    }
}
