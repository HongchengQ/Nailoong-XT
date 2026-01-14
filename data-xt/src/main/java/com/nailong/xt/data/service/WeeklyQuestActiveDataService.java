package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeeklyQuestActiveDataService {
    private final GameDataMgr gameDataMgr;

    public WeeklyQuestActiveConfig getWeeklyQuestActiveData(int id) {
        return gameDataMgr.getWeeklyQuestActiveConfigMap().get(String.valueOf(id));
    }
    public WeeklyQuestActiveConfig getWeeklyQuestActiveData(String id) {
        return gameDataMgr.getWeeklyQuestActiveConfigMap().get(id);
    }
}
