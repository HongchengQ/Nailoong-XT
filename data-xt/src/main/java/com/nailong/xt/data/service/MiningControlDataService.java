package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MiningControlDataService {
    private final GameDataMgr gameDataMgr;

    public MiningControlConfig getMiningControlData(int id) {
        return gameDataMgr.getMiningControlConfigMap().get(String.valueOf(id));
    }
    public MiningControlConfig getMiningControlData(String id) {
        return gameDataMgr.getMiningControlConfigMap().get(id);
    }

    public ArrayList<MiningControlConfig> getAllMiningControlData() {
        return new ArrayList<>(gameDataMgr.getMiningControlConfigMap().values());
    }
}
