package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityShopControlDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityShopControlConfig getActivityShopControlData(int id) {
        return gameDataMgr.getActivityShopControlConfigMap().get(String.valueOf(id));
    }
    public ActivityShopControlConfig getActivityShopControlData(String id) {
        return gameDataMgr.getActivityShopControlConfigMap().get(id);
    }

    public ArrayList<ActivityShopControlConfig> getAllActivityShopControlData() {
        return new ArrayList<>(gameDataMgr.getActivityShopControlConfigMap().values());
    }
}
