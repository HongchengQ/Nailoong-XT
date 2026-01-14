package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MainlineFloorDataService {
    private final GameDataMgr gameDataMgr;

    public MainlineFloorConfig getMainlineFloorData(int id) {
        return gameDataMgr.getMainlineFloorConfigMap().get(String.valueOf(id));
    }
    public MainlineFloorConfig getMainlineFloorData(String id) {
        return gameDataMgr.getMainlineFloorConfigMap().get(id);
    }

    public ArrayList<MainlineFloorConfig> getAllMainlineFloorData() {
        return new ArrayList<>(gameDataMgr.getMainlineFloorConfigMap().values());
    }
}
