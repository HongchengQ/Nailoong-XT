package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DailyInstanceTypeDataService {
    private final GameDataMgr gameDataMgr;

    public DailyInstanceTypeConfig getDailyInstanceTypeData(int id) {
        return gameDataMgr.getDailyInstanceTypeConfigMap().get(String.valueOf(id));
    }
    public DailyInstanceTypeConfig getDailyInstanceTypeData(String id) {
        return gameDataMgr.getDailyInstanceTypeConfigMap().get(id);
    }

    public ArrayList<DailyInstanceTypeConfig> getAllDailyInstanceTypeData() {
        return new ArrayList<>(gameDataMgr.getDailyInstanceTypeConfigMap().values());
    }
}
