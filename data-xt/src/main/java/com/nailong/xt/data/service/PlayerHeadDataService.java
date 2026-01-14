package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerHeadDataService {
    private final GameDataMgr gameDataMgr;

    public PlayerHeadConfig getPlayerHeadData(int id) {
        return gameDataMgr.getPlayerHeadConfigMap().get(String.valueOf(id));
    }
    public PlayerHeadConfig getPlayerHeadData(String id) {
        return gameDataMgr.getPlayerHeadConfigMap().get(id);
    }
}
