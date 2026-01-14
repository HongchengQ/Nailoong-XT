package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfinityTowerAffixDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerAffixConfig getInfinityTowerAffixData(int id) {
        return gameDataMgr.getInfinityTowerAffixConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerAffixConfig getInfinityTowerAffixData(String id) {
        return gameDataMgr.getInfinityTowerAffixConfigMap().get(id);
    }
}
