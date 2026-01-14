package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class FloorBuffDataService {
    private final GameDataMgr gameDataMgr;

    public FloorBuffConfig getFloorBuffData(int id) {
        return gameDataMgr.getFloorBuffConfigMap().get(String.valueOf(id));
    }
    public FloorBuffConfig getFloorBuffData(String id) {
        return gameDataMgr.getFloorBuffConfigMap().get(id);
    }

    public ArrayList<FloorBuffConfig> getAllFloorBuffData() {
        return new ArrayList<>(gameDataMgr.getFloorBuffConfigMap().values());
    }
}
