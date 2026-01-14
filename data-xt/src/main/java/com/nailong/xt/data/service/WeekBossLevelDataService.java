package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WeekBossLevelDataService {
    private final GameDataMgr gameDataMgr;

    public WeekBossLevelConfig getWeekBossLevelData(int id) {
        return gameDataMgr.getWeekBossLevelConfigMap().get(String.valueOf(id));
    }
    public WeekBossLevelConfig getWeekBossLevelData(String id) {
        return gameDataMgr.getWeekBossLevelConfigMap().get(id);
    }

    public ArrayList<WeekBossLevelConfig> getAllWeekBossLevelData() {
        return new ArrayList<>(gameDataMgr.getWeekBossLevelConfigMap().values());
    }
}
