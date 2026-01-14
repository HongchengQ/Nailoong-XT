package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EffectValueDataService {
    private final GameDataMgr gameDataMgr;

    public EffectValueConfig getEffectValueData(int id) {
        return gameDataMgr.getEffectValueConfigMap().get(String.valueOf(id));
    }
    public EffectValueConfig getEffectValueData(String id) {
        return gameDataMgr.getEffectValueConfigMap().get(id);
    }

    public ArrayList<EffectValueConfig> getAllEffectValueData() {
        return new ArrayList<>(gameDataMgr.getEffectValueConfigMap().values());
    }
}
