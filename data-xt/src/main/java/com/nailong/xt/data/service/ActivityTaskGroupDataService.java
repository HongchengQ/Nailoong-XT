package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityTaskGroupDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityTaskGroupConfig getActivityTaskGroupData(int id) {
        return gameDataMgr.getActivityTaskGroupConfigMap().get(String.valueOf(id));
    }
    public ActivityTaskGroupConfig getActivityTaskGroupData(String id) {
        return gameDataMgr.getActivityTaskGroupConfigMap().get(id);
    }
}
