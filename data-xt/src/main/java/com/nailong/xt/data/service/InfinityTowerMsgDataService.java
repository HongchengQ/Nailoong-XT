package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class InfinityTowerMsgDataService {
    private final GameDataMgr gameDataMgr;

    public InfinityTowerMsgConfig getInfinityTowerMsgData(int id) {
        return gameDataMgr.getInfinityTowerMsgConfigMap().get(String.valueOf(id));
    }
    public InfinityTowerMsgConfig getInfinityTowerMsgData(String id) {
        return gameDataMgr.getInfinityTowerMsgConfigMap().get(id);
    }

    public ArrayList<InfinityTowerMsgConfig> getAllInfinityTowerMsgData() {
        return new ArrayList<>(gameDataMgr.getInfinityTowerMsgConfigMap().values());
    }
}
