package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MiningDemoConfigDataService {
    private final GameDataMgr gameDataMgr;

    public MiningDemoConfigConfig getMiningDemoConfigData(int id) {
        return gameDataMgr.getMiningDemoConfigConfigMap().get(String.valueOf(id));
    }
    public MiningDemoConfigConfig getMiningDemoConfigData(String id) {
        return gameDataMgr.getMiningDemoConfigConfigMap().get(id);
    }

    public ArrayList<MiningDemoConfigConfig> getAllMiningDemoConfigData() {
        return new ArrayList<>(gameDataMgr.getMiningDemoConfigConfigMap().values());
    }
}
