package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
