package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WeekBossFloorDataService {
    private final GameDataMgr gameDataMgr;

    public WeekBossFloorConfig getWeekBossFloorData(int id) {
        return gameDataMgr.getWeekBossFloorConfigMap().get(String.valueOf(id));
    }
    public WeekBossFloorConfig getWeekBossFloorData(String id) {
        return gameDataMgr.getWeekBossFloorConfigMap().get(id);
    }

    public ArrayList<WeekBossFloorConfig> getAllWeekBossFloorData() {
        return new ArrayList<>(gameDataMgr.getWeekBossFloorConfigMap().values());
    }
}
