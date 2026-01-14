package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EffectDataService {
    private final GameDataMgr gameDataMgr;

    public EffectConfig getEffectData(int id) {
        return gameDataMgr.getEffectConfigMap().get(String.valueOf(id));
    }
    public EffectConfig getEffectData(String id) {
        return gameDataMgr.getEffectConfigMap().get(id);
    }

    public ArrayList<EffectConfig> getAllEffectData() {
        return new ArrayList<>(gameDataMgr.getEffectConfigMap().values());
    }
}
