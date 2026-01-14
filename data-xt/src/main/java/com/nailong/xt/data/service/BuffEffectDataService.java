package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BuffEffectDataService {
    private final GameDataMgr gameDataMgr;

    public BuffEffectConfig getBuffEffectData(int id) {
        return gameDataMgr.getBuffEffectConfigMap().get(String.valueOf(id));
    }
    public BuffEffectConfig getBuffEffectData(String id) {
        return gameDataMgr.getBuffEffectConfigMap().get(id);
    }

    public ArrayList<BuffEffectConfig> getAllBuffEffectData() {
        return new ArrayList<>(gameDataMgr.getBuffEffectConfigMap().values());
    }
}
