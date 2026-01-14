package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityGoodsDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityGoodsConfig getActivityGoodsData(int id) {
        return gameDataMgr.getActivityGoodsConfigMap().get(String.valueOf(id));
    }
    public ActivityGoodsConfig getActivityGoodsData(String id) {
        return gameDataMgr.getActivityGoodsConfigMap().get(id);
    }

    public ArrayList<ActivityGoodsConfig> getAllActivityGoodsData() {
        return new ArrayList<>(gameDataMgr.getActivityGoodsConfigMap().values());
    }
}
