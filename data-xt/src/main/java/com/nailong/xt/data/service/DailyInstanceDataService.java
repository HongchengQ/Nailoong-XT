package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DailyInstanceDataService {
    private final GameDataMgr gameDataMgr;

    public DailyInstanceConfig getDailyInstanceData(int id) {
        return gameDataMgr.getDailyInstanceConfigMap().get(String.valueOf(id));
    }
    public DailyInstanceConfig getDailyInstanceData(String id) {
        return gameDataMgr.getDailyInstanceConfigMap().get(id);
    }

    public ArrayList<DailyInstanceConfig> getAllDailyInstanceData() {
        return new ArrayList<>(gameDataMgr.getDailyInstanceConfigMap().values());
    }
}
