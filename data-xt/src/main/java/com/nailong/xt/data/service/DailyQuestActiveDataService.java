package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyQuestActiveDataService {
    private final GameDataMgr gameDataMgr;

    public DailyQuestActiveConfig getDailyQuestActiveData(int id) {
        return gameDataMgr.getDailyQuestActiveConfigMap().get(String.valueOf(id));
    }
    public DailyQuestActiveConfig getDailyQuestActiveData(String id) {
        return gameDataMgr.getDailyQuestActiveConfigMap().get(id);
    }
}
