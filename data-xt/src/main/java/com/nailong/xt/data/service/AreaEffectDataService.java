package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AreaEffectDataService {
    private final GameDataMgr gameDataMgr;

    public AreaEffectConfig getAreaEffectData(int id) {
        return gameDataMgr.getAreaEffectConfigMap().get(String.valueOf(id));
    }
    public AreaEffectConfig getAreaEffectData(String id) {
        return gameDataMgr.getAreaEffectConfigMap().get(id);
    }

    public ArrayList<AreaEffectConfig> getAllAreaEffectData() {
        return new ArrayList<>(gameDataMgr.getAreaEffectConfigMap().values());
    }
}
