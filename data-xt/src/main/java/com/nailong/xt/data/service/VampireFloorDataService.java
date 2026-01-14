package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireFloorDataService {
    private final GameDataMgr gameDataMgr;

    public VampireFloorConfig getVampireFloorData(int id) {
        return gameDataMgr.getVampireFloorConfigMap().get(String.valueOf(id));
    }
    public VampireFloorConfig getVampireFloorData(String id) {
        return gameDataMgr.getVampireFloorConfigMap().get(id);
    }
}
