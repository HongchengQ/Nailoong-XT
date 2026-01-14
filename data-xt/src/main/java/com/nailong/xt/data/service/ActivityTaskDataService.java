package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityTaskDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityTaskConfig getActivityTaskData(int id) {
        return gameDataMgr.getActivityTaskConfigMap().get(String.valueOf(id));
    }
    public ActivityTaskConfig getActivityTaskData(String id) {
        return gameDataMgr.getActivityTaskConfigMap().get(id);
    }
}
