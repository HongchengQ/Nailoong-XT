package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyInstanceFloorDataService {
    private final GameDataMgr gameDataMgr;

    public DailyInstanceFloorConfig getDailyInstanceFloorData(int id) {
        return gameDataMgr.getDailyInstanceFloorConfigMap().get(String.valueOf(id));
    }
    public DailyInstanceFloorConfig getDailyInstanceFloorData(String id) {
        return gameDataMgr.getDailyInstanceFloorConfigMap().get(id);
    }
}
