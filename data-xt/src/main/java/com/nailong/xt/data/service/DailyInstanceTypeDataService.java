package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
