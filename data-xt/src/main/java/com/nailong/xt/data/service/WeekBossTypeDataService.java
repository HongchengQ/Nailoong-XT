package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeekBossTypeDataService {
    private final GameDataMgr gameDataMgr;

    public WeekBossTypeConfig getWeekBossTypeData(int id) {
        return gameDataMgr.getWeekBossTypeConfigMap().get(String.valueOf(id));
    }
    public WeekBossTypeConfig getWeekBossTypeData(String id) {
        return gameDataMgr.getWeekBossTypeConfigMap().get(id);
    }
}
