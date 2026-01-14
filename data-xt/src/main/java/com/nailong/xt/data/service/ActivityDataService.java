package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityConfig getActivityData(int id) {
        return gameDataMgr.getActivityConfigMap().get(String.valueOf(id));
    }
    public ActivityConfig getActivityData(String id) {
        return gameDataMgr.getActivityConfigMap().get(id);
    }

    public ArrayList<ActivityConfig> getAllActivityData() {
        return new ArrayList<>(gameDataMgr.getActivityConfigMap().values());
    }
}
