package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HitDamageDataService {
    private final GameDataMgr gameDataMgr;

    public HitDamageConfig getHitDamageData(int id) {
        return gameDataMgr.getHitDamageConfigMap().get(String.valueOf(id));
    }
    public HitDamageConfig getHitDamageData(String id) {
        return gameDataMgr.getHitDamageConfigMap().get(id);
    }
}
