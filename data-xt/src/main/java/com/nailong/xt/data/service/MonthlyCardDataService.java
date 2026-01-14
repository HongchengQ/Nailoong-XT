package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonthlyCardDataService {
    private final GameDataMgr gameDataMgr;

    public MonthlyCardConfig getMonthlyCardData(int id) {
        return gameDataMgr.getMonthlyCardConfigMap().get(String.valueOf(id));
    }
    public MonthlyCardConfig getMonthlyCardData(String id) {
        return gameDataMgr.getMonthlyCardConfigMap().get(id);
    }

    public ArrayList<MonthlyCardConfig> getAllMonthlyCardData() {
        return new ArrayList<>(gameDataMgr.getMonthlyCardConfigMap().values());
    }
}
