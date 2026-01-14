package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DailyQuestAwardDataService {
    private final GameDataMgr gameDataMgr;

    public DailyQuestAwardConfig getDailyQuestAwardData(int id) {
        return gameDataMgr.getDailyQuestAwardConfigMap().get(String.valueOf(id));
    }
    public DailyQuestAwardConfig getDailyQuestAwardData(String id) {
        return gameDataMgr.getDailyQuestAwardConfigMap().get(id);
    }

    public ArrayList<DailyQuestAwardConfig> getAllDailyQuestAwardData() {
        return new ArrayList<>(gameDataMgr.getDailyQuestAwardConfigMap().values());
    }
}
