package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityTaskControlDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityTaskControlConfig getActivityTaskControlData(int id) {
        return gameDataMgr.getActivityTaskControlConfigMap().get(String.valueOf(id));
    }
    public ActivityTaskControlConfig getActivityTaskControlData(String id) {
        return gameDataMgr.getActivityTaskControlConfigMap().get(id);
    }
}
