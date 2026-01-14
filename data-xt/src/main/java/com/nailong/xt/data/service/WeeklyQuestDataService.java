package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WeeklyQuestDataService {
    private final GameDataMgr gameDataMgr;

    public WeeklyQuestConfig getWeeklyQuestData(int id) {
        return gameDataMgr.getWeeklyQuestConfigMap().get(String.valueOf(id));
    }
    public WeeklyQuestConfig getWeeklyQuestData(String id) {
        return gameDataMgr.getWeeklyQuestConfigMap().get(id);
    }

    public ArrayList<WeeklyQuestConfig> getAllWeeklyQuestData() {
        return new ArrayList<>(gameDataMgr.getWeeklyQuestConfigMap().values());
    }
}
