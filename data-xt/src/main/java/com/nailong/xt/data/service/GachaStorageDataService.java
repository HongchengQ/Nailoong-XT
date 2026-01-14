package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GachaStorageDataService {
    private final GameDataMgr gameDataMgr;

    public GachaStorageConfig getGachaStorageData(int id) {
        return gameDataMgr.getGachaStorageConfigMap().get(String.valueOf(id));
    }
    public GachaStorageConfig getGachaStorageData(String id) {
        return gameDataMgr.getGachaStorageConfigMap().get(id);
    }

    public ArrayList<GachaStorageConfig> getAllGachaStorageData() {
        return new ArrayList<>(gameDataMgr.getGachaStorageConfigMap().values());
    }
}
