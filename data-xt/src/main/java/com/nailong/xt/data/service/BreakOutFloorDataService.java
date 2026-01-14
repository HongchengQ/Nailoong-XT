package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BreakOutFloorDataService {
    private final GameDataMgr gameDataMgr;

    public BreakOutFloorConfig getBreakOutFloorData(int id) {
        return gameDataMgr.getBreakOutFloorConfigMap().get(String.valueOf(id));
    }
    public BreakOutFloorConfig getBreakOutFloorData(String id) {
        return gameDataMgr.getBreakOutFloorConfigMap().get(id);
    }

    public ArrayList<BreakOutFloorConfig> getAllBreakOutFloorData() {
        return new ArrayList<>(gameDataMgr.getBreakOutFloorConfigMap().values());
    }
}
