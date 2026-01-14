package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EffectDescDataService {
    private final GameDataMgr gameDataMgr;

    public EffectDescConfig getEffectDescData(int id) {
        return gameDataMgr.getEffectDescConfigMap().get(String.valueOf(id));
    }
    public EffectDescConfig getEffectDescData(String id) {
        return gameDataMgr.getEffectDescConfigMap().get(id);
    }

    public ArrayList<EffectDescConfig> getAllEffectDescData() {
        return new ArrayList<>(gameDataMgr.getEffectDescConfigMap().values());
    }
}
