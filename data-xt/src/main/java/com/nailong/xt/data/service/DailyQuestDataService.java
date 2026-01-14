package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DailyQuestDataService {
    private final GameDataMgr gameDataMgr;

    public DailyQuestConfig getDailyQuestData(int id) {
        return gameDataMgr.getDailyQuestConfigMap().get(String.valueOf(id));
    }
    public DailyQuestConfig getDailyQuestData(String id) {
        return gameDataMgr.getDailyQuestConfigMap().get(id);
    }

    public ArrayList<DailyQuestConfig> getAllDailyQuestData() {
        return new ArrayList<>(gameDataMgr.getDailyQuestConfigMap().values());
    }
}
