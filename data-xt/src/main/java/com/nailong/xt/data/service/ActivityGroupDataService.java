package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityGroupDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityGroupConfig getActivityGroupData(int id) {
        return gameDataMgr.getActivityGroupConfigMap().get(String.valueOf(id));
    }
    public ActivityGroupConfig getActivityGroupData(String id) {
        return gameDataMgr.getActivityGroupConfigMap().get(id);
    }

    public ArrayList<ActivityGroupConfig> getAllActivityGroupData() {
        return new ArrayList<>(gameDataMgr.getActivityGroupConfigMap().values());
    }
}
