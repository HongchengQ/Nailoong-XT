package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DailyInstanceRewardGroupDataService {
    private final GameDataMgr gameDataMgr;

    public DailyInstanceRewardGroupConfig getDailyInstanceRewardGroupData(int id) {
        return gameDataMgr.getDailyInstanceRewardGroupConfigMap().get(String.valueOf(id));
    }
    public DailyInstanceRewardGroupConfig getDailyInstanceRewardGroupData(String id) {
        return gameDataMgr.getDailyInstanceRewardGroupConfigMap().get(id);
    }

    public ArrayList<DailyInstanceRewardGroupConfig> getAllDailyInstanceRewardGroupData() {
        return new ArrayList<>(gameDataMgr.getDailyInstanceRewardGroupConfigMap().values());
    }
}
