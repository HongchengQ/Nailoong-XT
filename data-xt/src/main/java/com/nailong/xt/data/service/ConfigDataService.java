package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfigDataService {
    private final GameDataMgr gameDataMgr;

    public ConfigConfig getConfigData(int id) {
        return gameDataMgr.getConfigConfigMap().get(String.valueOf(id));
    }
    public ConfigConfig getConfigData(String id) {
        return gameDataMgr.getConfigConfigMap().get(id);
    }
}
