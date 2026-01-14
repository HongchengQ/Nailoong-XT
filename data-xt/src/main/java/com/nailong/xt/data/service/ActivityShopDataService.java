package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityShopDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityShopConfig getActivityShopData(int id) {
        return gameDataMgr.getActivityShopConfigMap().get(String.valueOf(id));
    }
    public ActivityShopConfig getActivityShopData(String id) {
        return gameDataMgr.getActivityShopConfigMap().get(id);
    }

    public ArrayList<ActivityShopConfig> getAllActivityShopData() {
        return new ArrayList<>(gameDataMgr.getActivityShopConfigMap().values());
    }
}
