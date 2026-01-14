package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WorldClassDataService {
    private final GameDataMgr gameDataMgr;

    public WorldClassConfig getWorldClassData(int id) {
        return gameDataMgr.getWorldClassConfigMap().get(String.valueOf(id));
    }
    public WorldClassConfig getWorldClassData(String id) {
        return gameDataMgr.getWorldClassConfigMap().get(id);
    }

    public ArrayList<WorldClassConfig> getAllWorldClassData() {
        return new ArrayList<>(gameDataMgr.getWorldClassConfigMap().values());
    }
}
