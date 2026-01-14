package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ChestDataService {
    private final GameDataMgr gameDataMgr;

    public ChestConfig getChestData(int id) {
        return gameDataMgr.getChestConfigMap().get(String.valueOf(id));
    }
    public ChestConfig getChestData(String id) {
        return gameDataMgr.getChestConfigMap().get(id);
    }

    public ArrayList<ChestConfig> getAllChestData() {
        return new ArrayList<>(gameDataMgr.getChestConfigMap().values());
    }
}
