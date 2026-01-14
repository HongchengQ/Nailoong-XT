package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PeriodicQuestDataService {
    private final GameDataMgr gameDataMgr;

    public PeriodicQuestConfig getPeriodicQuestData(int id) {
        return gameDataMgr.getPeriodicQuestConfigMap().get(String.valueOf(id));
    }
    public PeriodicQuestConfig getPeriodicQuestData(String id) {
        return gameDataMgr.getPeriodicQuestConfigMap().get(id);
    }

    public ArrayList<PeriodicQuestConfig> getAllPeriodicQuestData() {
        return new ArrayList<>(gameDataMgr.getPeriodicQuestConfigMap().values());
    }
}
