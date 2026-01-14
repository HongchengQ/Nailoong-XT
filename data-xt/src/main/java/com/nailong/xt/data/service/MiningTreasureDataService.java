package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MiningTreasureDataService {
    private final GameDataMgr gameDataMgr;

    public MiningTreasureConfig getMiningTreasureData(int id) {
        return gameDataMgr.getMiningTreasureConfigMap().get(String.valueOf(id));
    }
    public MiningTreasureConfig getMiningTreasureData(String id) {
        return gameDataMgr.getMiningTreasureConfigMap().get(id);
    }

    public ArrayList<MiningTreasureConfig> getAllMiningTreasureData() {
        return new ArrayList<>(gameDataMgr.getMiningTreasureConfigMap().values());
    }
}
