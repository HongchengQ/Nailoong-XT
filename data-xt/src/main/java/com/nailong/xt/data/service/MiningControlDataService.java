package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
