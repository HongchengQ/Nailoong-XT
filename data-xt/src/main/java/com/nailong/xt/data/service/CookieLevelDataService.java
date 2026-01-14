package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CookieLevelDataService {
    private final GameDataMgr gameDataMgr;

    public CookieLevelConfig getCookieLevelData(int id) {
        return gameDataMgr.getCookieLevelConfigMap().get(String.valueOf(id));
    }
    public CookieLevelConfig getCookieLevelData(String id) {
        return gameDataMgr.getCookieLevelConfigMap().get(id);
    }
}
