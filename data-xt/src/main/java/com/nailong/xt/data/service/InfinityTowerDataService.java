package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class InfinityTowerDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerConfig getInfinityTowerData(int id) {
        return gameDataMgr.getInfinityTowerConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerConfig getInfinityTowerData(String id) {
        return gameDataMgr.getInfinityTowerConfigMap().get(id);
    }

    public ArrayList<InfinityTowerConfig> getAllInfinityTowerData() {
        return new ArrayList<>(gameDataMgr.getInfinityTowerConfigMap().values());
    }
}
