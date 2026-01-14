package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PeriodicQuestGroupDataService {
    private final GameDataMgr gameDataMgr;

    public PeriodicQuestGroupConfig getPeriodicQuestGroupData(int id) {
        return gameDataMgr.getPeriodicQuestGroupConfigMap().get(String.valueOf(id));
    }
    public PeriodicQuestGroupConfig getPeriodicQuestGroupData(String id) {
        return gameDataMgr.getPeriodicQuestGroupConfigMap().get(id);
    }
}
