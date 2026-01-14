package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PeriodicQuestControlDataService {
    private final GameDataMgr gameDataMgr;

    public PeriodicQuestControlConfig getPeriodicQuestControlData(int id) {
        return gameDataMgr.getPeriodicQuestControlConfigMap().get(String.valueOf(id));
    }
    public PeriodicQuestControlConfig getPeriodicQuestControlData(String id) {
        return gameDataMgr.getPeriodicQuestControlConfigMap().get(id);
    }

    public ArrayList<PeriodicQuestControlConfig> getAllPeriodicQuestControlData() {
        return new ArrayList<>(gameDataMgr.getPeriodicQuestControlConfigMap().values());
    }
}
